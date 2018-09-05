package com.example.android.christianmusic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;

public class ZaboorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // Back Button for music category
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // Create a list of words
        final ArrayList<Song> zaboors = new ArrayList<Song>();
        zaboors.add(new Song("O Dhan He jo na Man da he ", "Zaboor 1",
                R.drawable.icon, R.drawable.play, R.drawable.w420));
        zaboors.add(new Song("Yehowa me pukarda haan", "Zaboor 139",
                R.drawable.icon, R.drawable.play, R.drawable.w421));
        zaboors.add(new Song("Teriyan Sifta de gawne a geet", "Zaboor 92",
                R.drawable.icon, R.drawable.play, R.drawable.w422));
        zaboors.add(new Song("Mera Rab YHVH he", "Unknow", R.drawable.icon,
                R.drawable.play, R.drawable.w423));
        zaboors.add(new Song("Mera Rab YHVH he", "Unknow", R.drawable.icon,
                R.drawable.play, R.drawable.w423));





        final CustomAdapter mySongs = new CustomAdapter(this, zaboors);
        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(mySongs);





        // Find list View onClick object listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {



                Intent nowPlayingIntent = new Intent(ZaboorActivity.this, NowPlayingActivity.class);


                nowPlayingIntent = nowPlayingIntent.putExtra("songN",  i);
                //Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

    }
}
