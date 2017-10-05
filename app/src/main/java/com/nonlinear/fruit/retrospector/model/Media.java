package com.nonlinear.fruit.retrospector.model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by nonfrt on 9/30/17.
 */

public class Media {
    // public static enum Category{MOVIE,TV_SERIES,BOOK,PODCAST,YOUTUBE,POEM,MUSIC,VIDEO_GAME,TABLETOP_GAME,PRODUCT,OTHER}

    private static final DecimalFormat FORMATTER = new DecimalFormat("#.00");

    private List<Review> reviews;
    private String title;
    private String description;
    private String creator;
    private String category;
    private String season;
    private String episode;
    private Integer id;

    public Media(){
        this("");
    }

    public Media(String title){
        this(title,"");
    }

    public Media(String title, String creator){
        this(title, creator, "");
    }

    public Media(String title, String creator, String category){
        this(title, creator, category, new ArrayList<Review>());
    }

    public Media(String title, String creator, String category, List<Review> reviews){
        setTitle(title);
        setCreator(creator);
        setCategory(category);
        setReviews(reviews);
        setSeason("");
        setEpisode("");
        setDescription("");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    private void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String seasonId) {
        this.season = seasonId;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episodeId) {
        this.episode = episodeId;
    }

    /**
     * Takes the average of all the ratings.
     * @return
     */
    public double getAverageRating() {
        if(reviews.size()==0)
            return 0.0;
        double mean = 0.0;
        for (Review review : reviews) {
            if(review.getRating()!=null)
                mean += review.getRating();
        }
        mean = mean/reviews.size();
        return mean;
    }

    /**
     * Retrieves the default user's most recent rating of this media. If none
     * is found, then it returns a 0.
     * @return
     */
    public int getCurrentRating(){
        Date newest = new Date(0L);
        int rating = 0;
        for (Review review : reviews) {
            Date rDate = review.getDate();
            if (rDate.after(newest)) {
                newest = rDate;
                rating = review.getRating();
            }

        }
        return rating;
    }

    /**
     * Retrieves the default user's first rating of this media. If none is
     * found, then it returns 0.
     * @return
     */
    public int getOriginalRating(){
        Date oldest = new Date();
        int rating = 0;
        for (Review review : reviews) {
            Date rDate = review.getDate();
            if (rDate.before(oldest)) {
                oldest = rDate;
                rating = review.getRating();
            }

        }
        return rating;
    }

    @Override
    public String toString() {
        String title = getTitle()==null||getTitle().equals("")? "??": getTitle();
        String season = getSeason()==null||getSeason().equals("")? "": " "+getSeason();
        String episode = getEpisode()==null||getEpisode().equals("")? "": ": "+getEpisode();
        String creator = getCreator()==null||getCreator().equals("")? "??": getCreator();
        return title+season+episode+" by "+creator;
    }

    public void clone(Media media){
        setId(media.getId());
        setTitle(media.getTitle());
        setCreator(media.getCreator());
        setSeason(media.getSeason());
        setEpisode(media.getEpisode());
        setDescription(media.getDescription());
        setCategory(media.getCategory());
        getReviews().clear();
        getReviews().addAll(media.getReviews());
    }
}
