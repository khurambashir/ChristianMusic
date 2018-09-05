package com.example.android.christianmusic;


import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        // Back Button for music category
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




        Intent intent = getIntent();
        Song nowPlayingIntent = intent.getParcelableExtra("songN");


        String songName = nowPlayingIntent.getSongName();
        String  artistName = nowPlayingIntent.getSingerName();
        int aArt = nowPlayingIntent.getAlbumArt();





// Find textView from Now playing xml and set current song
       TextView ctSong = (TextView) findViewById(R.id.current_song);
        ctSong.setText(songName);


// Find Text View from now playing activity and setting artist name
       TextView artist = (TextView) findViewById(R.id.artist);
        artist.setText(artistName);

        //find image view and set image resource
        ImageView albumArt = (ImageView) findViewById(R.id.art);
        albumArt.setImageResource(aArt);

//find button view in now_playing.xml layout and set toast message
        Button msg = (Button) findViewById(R.id.playButton);
        msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlayingActivity.this, "Music Play ", Toast.LENGTH_SHORT).show();
            }
        });

    }
}



