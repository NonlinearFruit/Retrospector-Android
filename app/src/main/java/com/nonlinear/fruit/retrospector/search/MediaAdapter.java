package com.nonlinear.fruit.retrospector.search;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import android.widget.Toast;

import com.nonlinear.fruit.retrospector.R;
import com.nonlinear.fruit.retrospector.media.MediaActivity;
import com.nonlinear.fruit.retrospector.model.Media;
import com.nonlinear.fruit.retrospector.util.QueryProcessor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nonfrt on 9/30/17.
 * https://github.com/codepath/android_guides/wiki/Using-an-ArrayAdapter-with-ListView
 * https://github.com/survivingwithandroid/Surviving-with-android/blob/master/ListView_Filter_Tutorial/src/com/survivingwithandroid/listview/SimpleList/PlanetAdapter.java
 */
public class MediaAdapter extends ArrayAdapter<Media> implements Filterable{

    private List<Media> planetList;
    private Context context;
    private Filter planetFilter;
    private List<Media> origPlanetList;

    public MediaAdapter(List<Media> planetList, Context ctx) {
        super(ctx, 0, planetList);
        this.planetList = planetList;
        this.context = ctx;
        this.origPlanetList = planetList;
    }

    public int getCount() {
        return planetList.size();
    }

    public Media getItem(int position) {
        return planetList.get(position);
    }

    public long getItemId(int position) {
        return planetList.get(position).hashCode();
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        PlanetHolder holder = new PlanetHolder();
        final Media p = planetList.get(position);

        // First let's verify the convertView is not null
        if (convertView == null) {
            // This a new view we inflate the new layout
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            final View v2 = inflater.inflate(R.layout.item_media, null);
//            v2.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Toast.makeText(v2.getContext(),"Media: "+p.getTitle(),Toast.LENGTH_LONG).show();
//                    Intent toMediaWeGo = new Intent(v2.getContext(), MediaActivity.class);
//                    toMediaWeGo.putExtra("Media ID",p.getId());
//                    v2.getContext().startActivity(toMediaWeGo);
//                }
//            });
            // Now we can fill the layout with the right values
            TextView title = (TextView) v2.findViewById(R.id.mediaTitle);
            TextView creator = (TextView) v2.findViewById(R.id.mediaCreator);


            holder.titleView = title;
            holder.creatorView = creator;

            v2.setTag(holder);
            v = v2;
        }
        else {
            holder = (PlanetHolder) v.getTag();
        }

        holder.titleView.setText(p.getTitle());
        holder.creatorView.setText(p.getCreator());


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
        public TextView titleView;
        public TextView creatorView;
    }



	/*
	 * We create our filter
	 */

    @Override
    public Filter getFilter() {
        if (planetFilter == null)
            planetFilter = new PlanetFilter();

        return planetFilter;
    }



    private class PlanetFilter extends Filter {



        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();
            // We implement here the filter logic
            if (constraint == null || constraint.length() == 0) {
                // No filter implemented we return all the list
                results.values = origPlanetList;
                results.count = origPlanetList.size();
            }
            else {
                // We perform filtering operation
                List<Media> nPlanetList = new ArrayList<Media>();

                for (Media p : planetList)
                    if (QueryProcessor.isMatchForMedia(constraint.toString(),p))
                        nPlanetList.add(p);

                results.values = nPlanetList;
                results.count = nPlanetList.size();
            }
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {

            // Now we have to inform the adapter about the new list filtered
            if (results.count == 0)
                notifyDataSetInvalidated();
            else {
                planetList = (List<Media>) results.values;
                notifyDataSetChanged();
            }

        }

    }
}