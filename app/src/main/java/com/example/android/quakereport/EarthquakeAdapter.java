package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

/**
 * Created by hudson on 16/05/18.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(@NonNull Context context, @NonNull List<Earthquake> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;

        if (listView == null) {
            listView = LayoutInflater.from(getContext())
                    .inflate(R.layout.earthquake_list_item, parent, false);
        }

        Earthquake earthquake = getItem(position);

        TextView magnitudeTextView = (TextView) listView.findViewById(R.id.magnitude_text_view);
        TextView locationTextView = (TextView) listView.findViewById(R.id.location_text_view);
        TextView dateTextView = (TextView) listView.findViewById(R.id.date_text_view);

        magnitudeTextView.setText(String.valueOf(earthquake.getMagnitude()));
        locationTextView.setText(earthquake.getLocation());

        String pattern = "MMM d, y";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.US);
        dateTextView.setText(simpleDateFormat.format(earthquake.getDate()));

        return listView;
    }
}
