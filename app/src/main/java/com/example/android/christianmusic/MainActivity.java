package com.example.android.christianmusic;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find Text View
        TextView zaboor = (TextView) findViewById(R.id.zaboor);
        //Set onClick Listner on view
        zaboor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent zaboorIntent = new Intent( MainActivity.this, ZaboorActivity.class);
                //Start the new activity
                startActivity(zaboorIntent);
            }
        });
        // Find the View that shows the family category
        TextView geet = (TextView) findViewById(R.id.geet);

        // Set a click listener on that View
        geet.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent geetIntent = new Intent(MainActivity.this, GeetActivity.class);

                // Start the new activity
                startActivity(geetIntent);
            }
        });

        // Find the View that shows the family category
        TextView gazals = (TextView) findViewById(R.id.gazals);

        // Set a click listener on that View
        gazals.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link GazalActivity}
                Intent geetIntent = new Intent(MainActivity.this, GazalsActivity.class);

                // Start the new activity
                startActivity(geetIntent);
            }
        });
    }
}
