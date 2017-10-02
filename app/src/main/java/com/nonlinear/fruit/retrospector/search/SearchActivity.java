package com.nonlinear.fruit.retrospector.search;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import com.nonlinear.fruit.retrospector.R;
import com.nonlinear.fruit.retrospector.model.Media;
import com.nonlinear.fruit.retrospector.model.RetroDbHelper;

// http://www.java2s.com/Code/Android/2D-Graphics/ShowsalistthatcanbefilteredinplacewithaSearchViewinnoniconifiedmode.htm
public class SearchActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    private static final String TAG = "SearchViewFilterMode";

    private RetroDbHelper myDb;
    private SearchView mSearchView;
    private ListView mListView;
    private MediaAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);

        setContentView(R.layout.activity_search);

        myDb = RetroDbHelper.getInstance(this);
//        sampleData();

        mSearchView = (SearchView) findViewById(R.id.search_view);
        mListView = (ListView) findViewById(R.id.list_view);
        mListView.setAdapter(mAdapter = new MediaAdapter(myDb.getAllMedia(),this));
        mListView.setTextFilterEnabled(true);
        setupSearchView();
    }

    private void sampleData() {
        int id = 12;
        Media m;
        m = new Media("Croods, The","DreamWorks","Movie");
        m.setId(id++);
        myDb.insertMedia(m);
        m = new Media("Ant-Man","Marvel","Movie");
        m.setId(id++);
        myDb.insertMedia(m);
        m = new Media("Geometry of Origami, The","Erik Demaine","Lecture");
        m.setId(id++);
        myDb.insertMedia(m);
        m = new Media("Swiss Family Robinson","Johann David Wyss","Book");
        m.setId(id++);
        myDb.insertMedia(m);
        m = new Media("Jabberwocky","Lewis Carroll","Poem");
        m.setId(id++);
        myDb.insertMedia(m);
    }

    private void setupSearchView() {
        mSearchView.setIconifiedByDefault(false);
        mSearchView.setOnQueryTextListener(this);
        mSearchView.setSubmitButtonEnabled(false);
    }

    public boolean onQueryTextChange(String newText) {
        if (TextUtils.isEmpty(newText)) {
            mListView.clearTextFilter();
        } else {
            mListView.setFilterText(newText.toString());
        }
        return true;
    }

    public boolean onQueryTextSubmit(String query) {
        return false;
    }
}