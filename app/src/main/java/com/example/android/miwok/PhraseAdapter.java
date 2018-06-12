package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PhraseAdapter extends ArrayAdapter<Phrase> {

    public PhraseAdapter(Activity context, ArrayList<Phrase> phrases) {
        super(context, 0, phrases);
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

        Phrase currentPhrase = (Phrase) getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentPhrase.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentPhrase.getDefaultTranslation());

        return listItemView;
        //return super.getView(position, convertView, parent);
    }
}
