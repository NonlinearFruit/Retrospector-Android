package com.nonlinear.fruit.retrospector.media;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import com.nonlinear.fruit.retrospector.R;
import com.nonlinear.fruit.retrospector.model.Media;
import com.nonlinear.fruit.retrospector.model.RetroDbHelper;
import com.nonlinear.fruit.retrospector.search.MediaAdapter;

/**
 * Created by nonfrt on 10/1/17.
 */

public class MediaActivity extends AppCompatActivity{

    RetroDbHelper myDb;
    Intent intent;
    TextView title;
    TextView creator;
    TextView season;
    TextView episode;
    TextView category;
    ListView reviewLister;
    ReviewAdapter rAdapter;

    Media media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);

        setContentView(R.layout.activity_media);

        myDb = RetroDbHelper.getInstance(this);
        intent = getIntent();
        media = myDb.getMediaById(intent.getIntExtra("Media ID",1));

        title = (TextView) findViewById(R.id.txtvTitle);
        creator = (TextView) findViewById(R.id.txtvCreator);
        season = (TextView) findViewById(R.id.txtvSeason);
        episode = (TextView) findViewById(R.id.txtvEpisode);
        category = (TextView) findViewById(R.id.txtvCategory);
        reviewLister = (ListView) findViewById(R.id.listvReviews);
        reviewLister.setAdapter(rAdapter = new ReviewAdapter(media.getReviews(),this));

        setupActivity();
    }

    private void setupActivity() {
        title.setText(media.getTitle());
        creator.setText(media.getCreator());
        season.setText(media.getSeason());
        episode.setText(media.getEpisode());
        category.setText(media.getCategory());
    }
}
