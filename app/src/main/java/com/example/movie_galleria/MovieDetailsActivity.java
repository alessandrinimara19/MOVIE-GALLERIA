package com.example.movie_galleria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MovieDetailsActivity extends AppCompatActivity {

    public static final String IMAGE_VIEW_MOVIE_POSTER_KEY = "movie_poster";

    ImageView ivMoviePoster;
    String moviePosterTag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        initComponents();

        moviePosterTag = getIntent().getStringExtra(IMAGE_VIEW_MOVIE_POSTER_KEY);
        switch (moviePosterTag){
            case "1":
                ivMoviePoster.setImageResource(R.drawable.reservoir_dogs);
                break;
            case "2":
                ivMoviePoster.setImageResource(R.drawable.pulp_fiction);
                break;
            case "3":
                ivMoviePoster.setImageResource(R.drawable.jackie_brown);
                break;
            case "4":
                ivMoviePoster.setImageResource(R.drawable.kill_bill_vol_1);
                break;
            case "5":
                ivMoviePoster.setImageResource(R.drawable.kill_bill_vol_2);
                break;
            case "6":
                ivMoviePoster.setImageResource(R.drawable.death_proof);
                break;
            case "7":
                ivMoviePoster.setImageResource(R.drawable.inglorious_basterds);
                break;
            case "8":
                ivMoviePoster.setImageResource(R.drawable.django);
                break;
            case "9":
                ivMoviePoster.setImageResource(R.drawable.the_hateful_eight);
                break;
            case "10":
                ivMoviePoster.setImageResource(R.drawable.once_upon_a_time_in_hollywood);
                break;
        }
    }

    private void initComponents() {
        ivMoviePoster = findViewById(R.id.details_iv_movie_poster);
    }
}