package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoundBoardLeo extends AppCompatActivity {

    private Button btnBurke, btnCrickets, btnDarren, btnDoorbell, btnDuck, btnGong, btnPunch, btnPunch2, btnShatter, btnSpring, btnToy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soundboard_leo);

        btnBurke = findViewById(R.id.btn_burke);
        btnCrickets = findViewById(R.id.btn_cricket);
        btnDarren = findViewById(R.id.btn_darren);
        btnDoorbell = findViewById(R.id.btn_doorbell);
        btnDuck = findViewById(R.id.btn_duck);




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