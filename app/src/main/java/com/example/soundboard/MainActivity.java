package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnBurke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBurke = findViewById(R.id.btn_burke);


        btnBurke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBurke();
            }
        });
    }



    private void playBurke(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_leo_burke);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }
}