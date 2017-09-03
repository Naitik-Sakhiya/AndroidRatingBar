package com.naitiks.androidratingbar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.AppCompatRatingBar
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivityKt : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ratingBar = findViewById(R.id.rating_bar) as AppCompatRatingBar
        val action = findViewById(R.id.btn_rating) as Button
        action.setOnClickListener {
            Toast.makeText(this@MainActivityKt, "Rating is: " + ratingBar.rating, Toast.LENGTH_SHORT).show()
        }
    }
}
