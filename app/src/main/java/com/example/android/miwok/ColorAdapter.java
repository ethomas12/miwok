package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorAdapter extends ArrayAdapter<Color> {

    public ColorAdapter(Activity context, ArrayList<Color> Colors) {
        super(context, 0, Colors);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
//            le inflate - inflates a new listItemView called list_item (turns an XML file into actual view objects)
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Color currentColor = (Color) getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentColor.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentColor.getDefaultTranslation());

        // Find the ImageView in the list_item.xml layout with the ID
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_image);
        // Get the image resource ID from the current Word object and
        // set the image to iconView
        iconView.setImageResource(currentColor.getImageId());

        return listItemView;
        //return super.getView(position, convertView, parent);
    }
}