package com.example.android.christianmusic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class GazalsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);


        // Back Button for music category
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // Create a list of words
        final ArrayList<Song> myGazals = new ArrayList<Song>();
        myGazals.add(new Song("Meri Jind Mer Jaan Yesu", "Unknow", R.drawable.icon, R.drawable.play, R.drawable.androidparty));
        myGazals.add(new Song("Meri Jind Mer Jaan Yesu", "Unknow", R.drawable.icon, R.drawable.play, R.drawable.androidparty));
        myGazals.add(new Song("Meri Jind Mer Jaan Yesu", "Unknow", R.drawable.icon, R.drawable.play, R.drawable.androidparty));
        myGazals.add(new Song("Meri Jind Mer Jaan Yesu", "Unknow", R.drawable.icon, R.drawable.play, R.drawable.androidparty));


        CustomAdapter mySongs = new CustomAdapter(this, myGazals);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(mySongs);

        // Find list View onClick object listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {




                Intent nowPlayingIntent = new Intent(GazalsActivity.this, NowPlayingActivity.class);


                nowPlayingIntent.putExtra("Content", myGazals);
                //Start the new activity
                startActivity(nowPlayingIntent);
            }
        });


    }
}