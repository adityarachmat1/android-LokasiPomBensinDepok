package com.example.carilokasi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
 
//class ini digunakan untuk mengubah tampilan listview tidak seperti bawaan Android pada umumnya
public class Terdekat1 extends ArrayAdapter<String> {
    private final Context context;
    private final String[] valuestitle;
    private final String[] valuessubtitle;
    private final int[] valuesimage;
 
    public Terdekat1(Context context, String[] valuestitle,
            String[] valuessubtitle, int[] valuesimage) {
        super(context, R.layout.terdekat, valuestitle);
        this.context = context;
        this.valuestitle = valuestitle;
        this.valuessubtitle = valuessubtitle;
        this.valuesimage = valuesimage;
    }
 
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // tampilan listview di atur dalam listview_layout.xml yang berada dalam
        // res/layout
        View rowView = inflater
                .inflate(R.layout.terdekat, parent, false);
        TextView title = (TextView) rowView.findViewById(R.id.title);
        TextView subtitle = (TextView) rowView.findViewById(R.id.subtitle);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
 
        //Mengisi item listview
        title.setText(valuestitle[position]);
        subtitle.setText(valuessubtitle[position]);
        imageView.setImageResource(valuesimage[position]);
 
        return rowView;
    }
}
