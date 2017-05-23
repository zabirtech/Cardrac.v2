package com.example.moha.cardrac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HowToPlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_play);
    }

    public void playGame(View v){

        Intent startGame = new Intent(HowToPlay.this, MainActivity.class);
        startActivity(startGame);

    }

    public void goBack(View v){

        Intent goBack = new Intent(HowToPlay.this, PlayActivity.class);
        startActivity(goBack);

    }
}
