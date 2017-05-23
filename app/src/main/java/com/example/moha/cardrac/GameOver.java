package com.example.moha.cardrac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class GameOver extends AppCompatActivity {

    MainActivity sc1 = new MainActivity();

    TextView totalSco;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        Intent over = getIntent();

        totalSco = (TextView) findViewById(R.id.totalS);
        String score = over.getStringExtra(MainActivity.MESSAGE);


        totalSco.setText(score);


    }



    public void playAgain(View v){
        Intent playA = new Intent(GameOver.this, MainActivity.class);
        startActivity(playA);
    }
}
