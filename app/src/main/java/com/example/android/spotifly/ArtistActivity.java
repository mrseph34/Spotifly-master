package com.example.android.spotifly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        CategoryItem youngboy = new CategoryItem("Young Boy Never Broke Again", R.drawable.youngboy);
        CategoryItem gunna = new CategoryItem("Gunna", R.drawable.gunna);
        CategoryItem rihanna = new CategoryItem("Rihanna", R.drawable.rihanna);
        CategoryItem cudi = new CategoryItem("Cudi", R.drawable.cudi);

        ArrayList<CategoryItem> artists = new ArrayList<>(Arrays.asList(youngboy,gunna,rihanna,cudi));

        ListView artistListview = findViewById(R.id.artist_listview);
        CategoryAdapter artistAdapter = new CategoryAdapter(this, artists);
        artistListview.setAdapter(artistAdapter);

    }

}
