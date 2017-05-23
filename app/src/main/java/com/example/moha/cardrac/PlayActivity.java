package com.example.moha.cardrac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
    }

    public void playGame(View v){

        Intent startGame = new Intent(PlayActivity.this, MainActivity.class);
        startActivity(startGame);

    }


    public void howToPlay(View v){

        Intent howTo = new Intent(PlayActivity.this, HowToPlay.class);
        startActivity(howTo);

    }

}
