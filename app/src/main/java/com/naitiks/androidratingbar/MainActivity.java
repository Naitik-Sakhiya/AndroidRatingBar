package com.naitiks.androidratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatRatingBar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final AppCompatRatingBar ratingBar = (AppCompatRatingBar) findViewById(R.id.rating_bar);
        Button action = (Button) findViewById(R.id.btn_rating);
        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Rating is: "+ratingBar.getRating(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
