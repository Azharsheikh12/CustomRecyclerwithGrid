package com.example.customrecyclergrid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    String image,name;
    Context context;
    TextView txt;
    ImageView Dimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        image = getIntent().getStringExtra("image");
        name = getIntent().getStringExtra("name");

        Log.d("name.......",name);
        Log.d("image.......",image);

        txt = (TextView)findViewById(R.id.txt);
        Dimage= (ImageView)findViewById(R.id.Dimage);
        txt.setText(name);
        Picasso.with(context).load(image).resize(110,110).centerCrop().into(Dimage);


    }
}