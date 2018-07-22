package com.example.aloofwillow.nationalanthems;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FlagActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textview;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag);
        imageView=findViewById(R.id.countryImage);
        textview=findViewById(R.id.countryName);
        Intent intent=getIntent();
        String country=intent.getStringExtra("country").toLowerCase();
        Toast.makeText(this, country, Toast.LENGTH_SHORT).show();
        imageView.setImageResource(getResources().getIdentifier(country,"drawable",getPackageName()));
        mediaPlayer=MediaPlayer.create(this,getResources().getIdentifier(country,"raw",getPackageName()));
        mediaPlayer.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mediaPlayer.stop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop();
    }
}
