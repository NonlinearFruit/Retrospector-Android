package com.nonlinear.fruit.retrospector.media;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import android.widget.Toast;

import com.nonlinear.fruit.retrospector.R;
import com.nonlinear.fruit.retrospector.model.Media;
import com.nonlinear.fruit.retrospector.model.Review;
import com.nonlinear.fruit.retrospector.search.MediaAdapter;
import com.nonlinear.fruit.retrospector.util.QueryProcessor;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by nonfrt on 10/1/17.
 */

public class ReviewAdapter extends ArrayAdapter<Review>{

    private List<Review> planetList;
    private Context context;
    private List<Review> origPlanetList;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

    public ReviewAdapter(List<Review> planetList, Context ctx) {
        super(ctx, 0, planetList);
        this.planetList = planetList;
        this.context = ctx;
        this.origPlanetList = planetList;
    }

    public int getCount() {
        return planetList.size();
    }

    public Review getItem(int position) {
        return planetList.get(position);
    }

    public long getItemId(int position) {
        return planetList.get(position).hashCode();
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        ReviewAdapter.PlanetHolder holder = new ReviewAdapter.PlanetHolder();
        final Review p = planetList.get(position);

        // First let's verify the convertView is not null
        if (convertView == null) {
            // This a new view we inflate the new layout
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            final View v2 = inflater.inflate(R.layout.item_review, null);
            v2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(v2.getContext(),"User: "+p.getUser(),Toast.LENGTH_LONG).show();
                }
            });
            // Now we can fill the layout with the right values
            TextView user = (TextView) v2.findViewById(R.id.txtvUser);
            TextView date = (TextView) v2.findViewById(R.id.txtvDate);
            TextView rate = (TextView) v2.findViewById(R.id.txtvRating);


            holder.userView = user;
            holder.dateView = date;
            holder.ratingView = rate;

            v2.setTag(holder);
            v = v2;
        }
        else {
            holder = (ReviewAdapter.PlanetHolder) v.getTag();
        }

        holder.userView.setText(p.getUser());
        holder.dateView.setText(dateFormat.format(p.getDate()));
        holder.ratingView.setText(p.getRating());

        return v;
    }

    public void resetData() {
        planetList = origPlanetList;
    }


	/* *********************************
	 * We use the holder pattern
	 * It makes the view faster and avoid finding the component
	 * **********************************/

    private static class PlanetHolder {
        public TextView userView;
        public TextView dateView;
        public TextView ratingView;
    }
}
