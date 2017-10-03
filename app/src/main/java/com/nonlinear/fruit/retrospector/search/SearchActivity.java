package com.nonlinear.fruit.retrospector.search;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.nonlinear.fruit.retrospector.R;
import com.nonlinear.fruit.retrospector.media.MediaActivity;
import com.nonlinear.fruit.retrospector.model.Media;
import com.nonlinear.fruit.retrospector.model.RetroDbHelper;
import com.nonlinear.fruit.retrospector.review.ReviewActivity;
import com.nonlinear.fruit.retrospector.util.SampleData;

// http://www.java2s.com/Code/Android/2D-Graphics/ShowsalistthatcanbefilteredinplacewithaSearchViewinnoniconifiedmode.htm
public class SearchActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    private static final String TAG = "SearchViewFilterMode";

    private RetroDbHelper myDb;
    private SearchView mSearchView;
    private ListView mListView;
    private MediaAdapter mAdapter;
    private Button btnFake;
    private Button btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_search);

        myDb = RetroDbHelper.getInstance(this);

        mSearchView = (SearchView) findViewById(R.id.search_view);
        mListView = (ListView) findViewById(R.id.list_view);
        btnFake = (Button) findViewById(R.id.btn_fake);
        btnDelete = (Button) findViewById(R.id.btn_delete);
        mListView.setAdapter(mAdapter = new MediaAdapter(myDb.getAllMedia(),this));
        mListView.setTextFilterEnabled(false);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Media media= (Media) parent.getAdapter().getItem(position);
                Toast.makeText(view.getContext(),"Media: "+media.getTitle(),Toast.LENGTH_LONG).show();
                Intent toMediaWeGo = new Intent(SearchActivity.this, MediaActivity.class);
                toMediaWeGo.putExtra("Media ID",media.getId());
                view.getContext().startActivity(toMediaWeGo);
            }
        });
        setupSearchView();
    }

    private void addSampleData() {
        for (Media m : SampleData.getMedia()) {
            myDb.insertMedia(m);
        }
    }

    private void setupSearchView() {
        mSearchView.setIconifiedByDefault(false);
        mSearchView.setOnQueryTextListener(this);
        mSearchView.setSubmitButtonEnabled(false);

        btnFake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addSampleData();
                mListView.setAdapter(mAdapter = new MediaAdapter(myDb.getAllMedia(),SearchActivity.this));
                mListView.deferNotifyDataSetChanged();
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDb.clear();
                mListView.setAdapter(mAdapter = new MediaAdapter(myDb.getAllMedia(),SearchActivity.this));
                mListView.deferNotifyDataSetChanged();
            }
        });
    }

    public boolean onQueryTextChange(String newText) {
        if (TextUtils.isEmpty(newText)) {
//            mListView.clearTextFilter();
            mAdapter.getFilter().filter("");
        } else {
//            mListView.setFilterText(newText.toString());
            mAdapter.getFilter().filter(newText.toString());
        }
        return true;
    }

    public boolean onQueryTextSubmit(String query) {
        return false;
    }
}