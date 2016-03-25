package com.nguyen.nanodegree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      Button spotifyStreamer = (Button)findViewById(R.id.spotify_streamer);
      Button scoresApp = (Button)findViewById(R.id.scores_app);
      Button libraryApp = (Button)findViewById(R.id.library_app);
      Button buildItBigger = (Button)findViewById(R.id.build_it_bigger);
      Button baconReader = (Button)findViewById(R.id.bacon_reader);
      Button capstone = (Button)findViewById(R.id.capstone);

      final String toastText = "This button will launch my ";
      spotifyStreamer.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            Toast.makeText(MainActivity.this, toastText + "Spotify Streamer", Toast.LENGTH_SHORT).show();
         }
      });
      scoresApp.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            Toast.makeText(MainActivity.this, toastText + "Scores App", Toast.LENGTH_SHORT).show();
         }
      });
      libraryApp.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            Toast.makeText(MainActivity.this, toastText + "Library App", Toast.LENGTH_SHORT).show();
         }
      });
      buildItBigger.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            Toast.makeText(MainActivity.this, toastText + "Build It Bigger App", Toast.LENGTH_SHORT).show();
         }
      });
      baconReader.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            Toast.makeText(MainActivity.this, toastText + "Bacon Reader", Toast.LENGTH_SHORT).show();
         }
      });
      capstone.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            Toast.makeText(MainActivity.this, toastText + "Capstone App", Toast.LENGTH_SHORT).show();
         }
      });
   }
}
