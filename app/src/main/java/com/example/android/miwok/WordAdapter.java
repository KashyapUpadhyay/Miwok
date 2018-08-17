package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Kashyap on 28-06-2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    private int mColorid;
    public WordAdapter(Activity context, ArrayList<Word> words,int colorid) {
        super(context,0,words);
        mColorid=colorid;

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word miwokWord=getItem(position);



            ImageView theImage = (ImageView) listItemView.findViewById(R.id.image);

        if(miwokWord.checkImage())
        {theImage.setVisibility(View.GONE);}
        else
        {
            theImage.setVisibility(View.VISIBLE);
            theImage.setImageResource(miwokWord.getmImageResourceId());
        }
            TextView theMiwok = (TextView) listItemView.findViewById(R.id.miwok_word);
            theMiwok.setText(miwokWord.getmMiwokTrandslation());



            TextView theEnglish = (TextView) listItemView.findViewById(R.id.english_word);
            theEnglish.setText(miwokWord.getmDefaultTranslation());
        View textContainer= listItemView.findViewById(R.id.text_Container);
        int color = ContextCompat.getColor(getContext(),mColorid);
        textContainer.setBackgroundColor(color);



        return listItemView;
    }
}
