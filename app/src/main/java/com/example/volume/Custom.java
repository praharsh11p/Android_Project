package com.example.volume;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Custom extends ArrayAdapter<CustomShape> {

    private ArrayList<CustomShape> shapeArrayList;
    Context context;

    public Custom(ArrayList<CustomShape> shapeArrayList, Context context) {
        super(context, R.layout.grid_item,shapeArrayList);
        this.shapeArrayList = shapeArrayList;
        this.context = context;
    }
    private static class Myview{
       TextView shapename;
       ImageView shapeimg;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       CustomShape shapes = getItem(position);
       Myview myview;
       if (convertView == null){
           myview = new Myview();
           LayoutInflater inflater = LayoutInflater.from(getContext());
           convertView = inflater.inflate(R.layout.grid_item,parent, false);
           myview.shapename = convertView.findViewById(R.id.text1);
           myview.shapeimg = convertView.findViewById(R.id.image1);
           convertView.setTag(myview);
       }
       else {
           myview = (Myview) convertView.getTag();
       }
       myview.shapename.setText(shapes.getShapename());
       myview.shapeimg.setImageResource(shapes.getShapeimg());

       return convertView;
    }
}
