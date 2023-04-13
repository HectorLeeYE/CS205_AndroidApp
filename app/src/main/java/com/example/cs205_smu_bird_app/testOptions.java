package com.example.cs205_smu_bird_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.media.MediaPlayer;
import java.util.concurrent.locks.ReentrantLock;

public class testOptions extends AppCompatActivity {
    private Button muteMusic;
    private Button back2Game;
    private MediaPlayer mediaPlayer;
    private boolean isMusicMuted;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_testoptions);

        // Get the initial value of isMusicMuted from the intent
        Intent intent = getIntent();
        isMusicMuted = intent.getBooleanExtra("isMusicMuted", false);

        muteMusic = (Button) findViewById(R.id.mute_button);
        updateButtonText();
        muteMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isMusicMuted = !isMusicMuted;
                updateButtonText();
            }
        });

        back2Game = (Button) findViewById(R.id.back2game);
        back2Game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed2();
            }
        });
    }

    private void updateButtonText() {
        if (isMusicMuted) {
            muteMusic.setText("Unmute Music");
        } else {
            muteMusic.setText("Mute Music");
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }


    public void onBackPressed2() {
        Intent intent = new Intent();
        intent.putExtra("isMusicMuted", isMusicMuted);
        setResult(RESULT_OK, intent);
        super.onBackPressed();

    }
}