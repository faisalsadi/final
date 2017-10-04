package com.example.hp1.appf;

import android.content.ClipData;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Hp1 on 27/09/2017.
 */

public class CustomAdapter extends ArrayAdapter<Item> {
    public CustomAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Item> objects) {
        super(context, resource, objects);
    }
    @Override
    public View getView (int postion , View convertView , ViewGroup parent) {
        LayoutInflater imageInflater = LayoutInflater.from(getContext());
        View cuView = imageInflater.inflate(R.layout.custom_row, parent, false);

        Item item = getItem(postion);

        TextView title= (TextView)cuView.findViewById(R.id.tv2);
        ImageView image=(ImageView)cuView.findViewById(R.id.iv1);

        title.setText(item.getTitle());
        image.setImageResource(item.getImageid());

        return cuView;

    }
}
