package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnBurke, btnFabrizio, btnDarren, btnDoorbell, btnSpring, btnPunch, btnPunch2, btnShatter, btnDuck, btnCricket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBurke = findViewById(R.id.btn_burke);
        btnFabrizio = findViewById(R.id.btn_fabrizio);
        btnDarren = findViewById(R.id.btn_darren);
        btnDoorbell = findViewById(R.id.btn_doorbell);
        btnSpring = findViewById(R.id.btn_spring);


        btnFabrizio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playFabrizio();
            }
        });

        btnBurke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBurke();
            }
        });
        btnDarren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playDarren();
            }
        });

        btnDoorbell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playDoorbell();
            }
        });

        btnSpring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSpring();
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