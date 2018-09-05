package com.example.android.christianmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class GeetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);


        // Back Button for music category
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // Create a list of words
        final ArrayList<Song> myGeet = new ArrayList<Song>();
        myGeet.add(new Song("Mera Rab YHVH he", "Sam", R.drawable.icon, R.drawable.play, R.drawable.androidparty));
        myGeet.add(new Song("Meri Jind meri Jaan", "Anik", R.drawable.icon, R.drawable.play, R.drawable.androidparty));
        myGeet.add(new Song("Me nai Kalla", "Worshipper", R.drawable.icon, R.drawable.play, R.drawable.androidparty));
        myGeet.add(new Song("A yesi Nasri ", "Singer", R.drawable.icon, R.drawable.play, R.drawable.androidparty));
        myGeet.add(new Song("Tera Shukar ho", "Unknow", R.drawable.icon, R.drawable.play, R.drawable.androidparty));

        CustomAdapter mySongs = new CustomAdapter(this, myGeet);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(mySongs);


        // Find list View onClick object listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {




                Intent nowPlayingIntent = new Intent(GeetActivity.this,  NowPlayingActivity.class);


                nowPlayingIntent.putExtra("Content", myGeet);
                //Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

    }
}
