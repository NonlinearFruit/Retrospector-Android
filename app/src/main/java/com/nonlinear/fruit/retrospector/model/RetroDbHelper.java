package com.nonlinear.fruit.retrospector.model;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Follow the singleton pattern
 * Created by nonfrt on 9/30/17.
 * http://www.androiddesignpatterns.com/2012/05/correctly-managing-your-sqlite-database.html
 */

public class RetroDbHelper extends SQLiteOpenHelper {

    private static RetroDbHelper sInstance;

    public static synchronized RetroDbHelper getInstance(Context context) {

        // Use the application context, which will ensure that we
        // don't accidentally leak an Activity's context.
        if (sInstance == null) {
            sInstance = new RetroDbHelper(context.getApplicationContext());
        }
        return sInstance;
    }

    private static final String DB = "Retrospector.db";
    private static final Integer VERSION = 1;
    private static final String Tb_Media = "Media";
        private static final String Co_Media_Id = "ID";
        private static final String Co_Media_Title = "Title";
        private static final String Co_Media_Creator = "Creator";
        private static final String Co_Media_Season = "Season";
        private static final String Co_Media_Episode = "Episode";
        private static final String Co_Media_Category = "Category";
        private static final String Co_Media_Description = "Description";
    private static final String Tb_Reviews = "Reviews";
        private static final String Co_Reviews_Id = "ID";
        private static final String Co_Reviews_MediaId = "MediaId";
        private static final String Co_Reviews_Rating = "Rating";
        private static final String Co_Reviews_User = "User";
        private static final String Co_Reviews_Date = "Date";
        private static final String Co_Reviews_Review = "Review";


    private RetroDbHelper(Context context) {
        super(context, DB, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + Tb_Media +" (" +
                Co_Media_Id + " INTEGER PRIMARY KEY," +
                Co_Media_Title + " TEXT," +
                Co_Media_Creator + " TEXT," +
                Co_Media_Season + " TEXT," +
                Co_Media_Episode + " TEXT," +
                Co_Media_Description + " TEXT," +
                Co_Media_Category + " TEXT" +
                ")");

        db.execSQL("create table " + Tb_Reviews +" (" +
                Co_Reviews_Id + " INTEGER PRIMARY KEY," +
                Co_Reviews_MediaId + " TEXT," +
                Co_Reviews_Rating + " INTEGER," +
                Co_Reviews_User + " TEXT," +
                Co_Reviews_Date + " LONG," +
                Co_Reviews_Review + " TEXT" +
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // To Do?
    }

    // Does not include reviews
    public List<Media> getAllMedia() {
        List<Media> media = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor results = db.rawQuery("select * from "+Tb_Media,null);

        int iId = results.getColumnIndex(Co_Media_Id);
        int iTitle = results.getColumnIndex(Co_Media_Title);
        int iCreator = results.getColumnIndex(Co_Media_Creator);
        int iSeason = results.getColumnIndex(Co_Media_Season);
        int iEpisode = results.getColumnIndex(Co_Media_Episode);
        int iCategory = results.getColumnIndex(Co_Media_Category);
        int iDescription = results.getColumnIndex(Co_Media_Description);

        if (results.moveToFirst()){
            do{
                Media m = new Media(
                        results.getString(iTitle),
                        results.getString(iCreator),
                        results.getString(iCategory)
                );

                m.setId(results.getInt(iId));
                m.setSeason(results.getString(iSeason));
                m.setEpisode(results.getString(iEpisode));
                m.setDescription(results.getString(iDescription));

//                m.getReviews().addAll(getReviewByMedia(m.getId()));

                media.add(m);
            }while(results.moveToNext());
        }
        results.close();
        return media;
    }

    public List<Review> getReviewByMedia(int mediaId) {
        List<Review> reviews = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor results = db.rawQuery("select * from "+Tb_Reviews+" where "+Co_Reviews_MediaId+"="+mediaId,null);

        int iId = results.getColumnIndex(Co_Reviews_Id);
        int iMediaId = results.getColumnIndex(Co_Reviews_MediaId);
        int iRating = results.getColumnIndex(Co_Reviews_Rating);
        int iUser = results.getColumnIndex(Co_Reviews_User);
        int iDate = results.getColumnIndex(Co_Reviews_Date);
        int iReview = results.getColumnIndex(Co_Reviews_Review);

        if (results.moveToFirst()){
            do{
                Review r = new Review(
                        results.getInt(iRating),
                        new Date(results.getLong(iDate)),
                        results.getString(iUser),
                        results.getString(iReview)
                );
                r.setId(results.getInt(iId));
                r.setMediaId(results.getInt(iMediaId));

                reviews.add(r);
                results.moveToNext();
            }while(results.moveToNext());
        }
        results.close();
        return reviews;
    }

    public boolean insertMedia(Media media) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Co_Media_Id,media.getId());
        contentValues.put(Co_Media_Title,media.getTitle());
        contentValues.put(Co_Media_Creator,media.getCreator());
        contentValues.put(Co_Media_Season,media.getSeason());
        contentValues.put(Co_Media_Episode,media.getEpisode());
        contentValues.put(Co_Media_Category,media.getCategory());
        contentValues.put(Co_Media_Description,media.getDescription());
        long result = db.insert(Tb_Media,null ,contentValues);
        if (result == -1)
            return false;

        for (Review review : media.getReviews()) {
            insertReview(review);
        }

        return true;
    }

    public boolean insertReview(Review review) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Co_Reviews_Id,review.getId());
        contentValues.put(Co_Reviews_MediaId,review.getMediaId());
        contentValues.put(Co_Reviews_Rating,review.getRating());
        contentValues.put(Co_Reviews_Date,review.getDate().getTime());
        contentValues.put(Co_Reviews_User,review.getUser());
        contentValues.put(Co_Reviews_Review,review.getReview());
        long result = db.insert(Tb_Reviews,null ,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    // includes reviews
    public Media getMediaById(int id) {
        Media media = null;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor results = db.rawQuery("select * from "+Tb_Media+" where id="+id,null);

        int iId = results.getColumnIndex(Co_Media_Id);
        int iTitle = results.getColumnIndex(Co_Media_Title);
        int iCreator = results.getColumnIndex(Co_Media_Creator);
        int iSeason = results.getColumnIndex(Co_Media_Season);
        int iEpisode = results.getColumnIndex(Co_Media_Episode);
        int iCategory = results.getColumnIndex(Co_Media_Category);
        int iDescription = results.getColumnIndex(Co_Media_Description);

        if (results.moveToFirst()){
            media = new Media(
                    results.getString(iTitle),
                    results.getString(iCreator),
                    results.getString(iCategory)
            );

            media.setId(id);
            media.setSeason(results.getString(iSeason));
            media.setEpisode(results.getString(iEpisode));
            media.setDescription(results.getString(iDescription));
            media.getReviews().addAll(getReviewByMedia(id));
        }
        results.close();
        return media;
    }
}
