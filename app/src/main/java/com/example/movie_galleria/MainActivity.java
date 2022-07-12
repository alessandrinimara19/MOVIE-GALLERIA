package com.example.movie_galleria;

import static com.example.movie_galleria.MovieDetailsActivity.IMAGE_VIEW_MOVIE_POSTER_KEY;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView ivReservoirDogs;
    ImageView ivPulpFiction;
    ImageView ivJackieBrown;
    ImageView ivKillBill1;
    ImageView ivKillBill2;
    ImageView ivDeathProof;
    ImageView ivIngloriousBasterds;
    ImageView ivDjango;
    ImageView ivTheHateful8;
    ImageView ivOnceUponATime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        setListners();
    }

    private void setListners() {
        ivReservoirDogs.setOnClickListener(openMovieDetailsActivity());
        ivPulpFiction.setOnClickListener(openMovieDetailsActivity());
        ivJackieBrown.setOnClickListener(openMovieDetailsActivity());
        ivKillBill1.setOnClickListener(openMovieDetailsActivity());
        ivKillBill2.setOnClickListener(openMovieDetailsActivity());
        ivDeathProof.setOnClickListener(openMovieDetailsActivity());
        ivIngloriousBasterds.setOnClickListener(openMovieDetailsActivity());
        ivDjango.setOnClickListener(openMovieDetailsActivity());
        ivTheHateful8.setOnClickListener(openMovieDetailsActivity());
        ivOnceUponATime.setOnClickListener(openMovieDetailsActivity());
    }

    private View.OnClickListener openMovieDetailsActivity() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra(IMAGE_VIEW_MOVIE_POSTER_KEY, view.getTag().toString());
                startActivity(intent);
            }
        };
    }

    private void initComponents() {
        ivReservoirDogs = findViewById(R.id.iv_reservoir_dogs);
        ivPulpFiction = findViewById(R.id.iv_pulp_fiction);
        ivJackieBrown = findViewById(R.id.iv_jackie_brown);
        ivKillBill1 = findViewById(R.id.iv_kill_bill_vol1);
        ivKillBill2 = findViewById(R.id.iv_kill_bill_vol2);
        ivDeathProof = findViewById(R.id.iv_death_proof);
        ivIngloriousBasterds = findViewById(R.id.iv_inglorious_basterds);
        ivDjango = findViewById(R.id.iv_django_unchained);
        ivTheHateful8 = findViewById(R.id.iv_the_hateful_eight);
        ivOnceUponATime = findViewById(R.id.iv_once_upon_a_time_in_hollywood);
    }
}