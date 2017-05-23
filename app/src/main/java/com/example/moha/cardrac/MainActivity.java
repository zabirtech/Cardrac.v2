package com.example.moha.cardrac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE = "com.example.moha.cardrac.MESSAGE";

    // VARIABLER

    //Stora kortet
    ImageView bigCard;

    //ANimation
    Animation anim;

    //Poängen som sätts efter frag
    int scorePoints = 0;
    TextView scoreCol1;


    //ANtal drag kvar.
    TextView left;
    int klickLeft = 25;


    //Bakgrundsmusiken och Klick-ljudet.
    MediaPlayer bgmusic;
    MediaPlayer klickSound;



    //Arrayen som innehåller alla kort(kortspelet).
    ArrayList <Card> cards = new ArrayList<>();

    //Arrayer som kommer att ta emot random-kort från stora Arrayen.
    ArrayList<Card> col1 = new ArrayList<>();
    ArrayList<Card> col2 = new ArrayList<>();
    ArrayList<Card> col3 = new ArrayList<>();
    ArrayList<Card> col4 = new ArrayList<>();

    ImageView nullCard1, nullCard2, nullCard3, nullCard4
            , nullCard5, nullCard6, nullCard7, nullCard8
            , nullCard9, nullCard10, nullCard11, nullCard12
            , nullCard13, nullCard14, nullCard15, nullCard16;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bakgrundsmudiken.
        klickSound = MediaPlayer.create(this, R.raw.klick);
        bgmusic = MediaPlayer.create(this, R.raw.bgmusic);
        bgmusic.setLooping(true);
        bgmusic.start();

        //Stora kortet där man får random-kort som sedan sätts i arrayen.
        bigCard = (ImageView) findViewById(R.id.bigCard);

        //Animation
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadein);

        //Drag kvar.
        left = (TextView) findViewById(R.id.left);

        //Till för poäng
        scoreCol1 = (TextView) findViewById(R.id.scorePoints);



        //NullCards, alla svarta rutor som sedan ersätts med ett random-kort.
        nullCard1 = (ImageView) findViewById(R.id.nullCard1);
        nullCard2 = (ImageView) findViewById(R.id.nullCard2);
        nullCard3 = (ImageView) findViewById(R.id.nullCard3);
        nullCard4 = (ImageView) findViewById(R.id.nullCard4);
        nullCard5 = (ImageView) findViewById(R.id.nullCard5);
        nullCard6 = (ImageView) findViewById(R.id.nullCard6);
        nullCard7 = (ImageView) findViewById(R.id.nullCard7);
        nullCard8 = (ImageView) findViewById(R.id.nullCard8);
        nullCard9 = (ImageView) findViewById(R.id.nullCard9);
        nullCard10 = (ImageView) findViewById(R.id.nullCard10);
        nullCard11 = (ImageView) findViewById(R.id.nullCard11);
        nullCard12 = (ImageView) findViewById(R.id.nullCard12);
        nullCard13 = (ImageView) findViewById(R.id.nullCard13);
        nullCard14 = (ImageView) findViewById(R.id.nullCard14);
        nullCard15 = (ImageView) findViewById(R.id.nullCard15);
        nullCard16 = (ImageView) findViewById(R.id.nullCard16);




        // Hjärter
        Card ca = new Card(1, R.drawable.ha); //Hjärter Ess
        cards.add(ca);
        ca = new Card(2, R.drawable.h2); //Hjärter 2
        cards.add(ca);
        ca = new Card(3, R.drawable.h3); //Hjärter 3
        cards.add(ca);
        ca = new Card(4, R.drawable.h4); //Hjärter 4
        cards.add(ca);
        ca = new Card(5, R.drawable.h5); //Hjärter 5
        cards.add(ca);
        ca = new Card(6, R.drawable.h6); //Hjärter 6
        cards.add(ca);
        ca = new Card(7, R.drawable.h7); //Hjärter 7
        cards.add(ca);
        ca = new Card(8, R.drawable.h8); //Hjärter 8
        cards.add(ca);
        ca = new Card(9, R.drawable.h9); //Hjärter 9
        cards.add(ca);
        ca = new Card(10, R.drawable.h10); //Hjärter 10
        cards.add(ca);
        ca = new Card(11, R.drawable.hj); //Hjärter Knekt
        cards.add(ca);
        ca = new Card(12, R.drawable.hq); //Hjärter Dam
        cards.add(ca);
        ca = new Card(13, R.drawable.hk); //Hjärter Kung
        cards.add(ca);

        // Hjärter
        ca = new Card(1, R.drawable.ka); //Klöver Ess
        cards.add(ca);
        ca = new Card(2, R.drawable.k2); //Klöver 2
        cards.add(ca);
        ca = new Card(3, R.drawable.k3); //Klöver 3
        cards.add(ca);
        ca = new Card(4, R.drawable.k4); //Klöver 4
        cards.add(ca);
        ca = new Card(5, R.drawable.k5); //Klöver 5
        cards.add(ca);
        ca = new Card(6, R.drawable.k6); //Klöver 6
        cards.add(ca);
        ca = new Card(7, R.drawable.k7); //Klöver 7
        cards.add(ca);
        ca = new Card(8, R.drawable.k8); //Klöver 8
        cards.add(ca);
        ca = new Card(9, R.drawable.k9); //Klöver 9
        cards.add(ca);
        ca = new Card(10, R.drawable.k10); //Klöver 10
        cards.add(ca);
        ca = new Card(11, R.drawable.kj); //Klöver Knekt
        cards.add(ca);
        ca = new Card(12, R.drawable.kq); //Klöver Dam
        cards.add(ca);
        ca = new Card(13, R.drawable.kk); //Klöver Kung
        cards.add(ca);

        // Hjärter
        ca = new Card(1, R.drawable.ra); //Ruter Ess
        cards.add(ca);
        ca = new Card(2, R.drawable.r2); //Ruter 2
        cards.add(ca);
        ca = new Card(3, R.drawable.r3); //Ruter 3
        cards.add(ca);
        ca = new Card(4, R.drawable.r4); //Ruter 4
        cards.add(ca);
        ca = new Card(5, R.drawable.r5); //Ruter 5
        cards.add(ca);
        ca = new Card(6, R.drawable.r6); //Ruter 6
        cards.add(ca);
        ca = new Card(7, R.drawable.r7); //Ruter 7
        cards.add(ca);
        ca = new Card(8, R.drawable.r8); //Ruter 8
        cards.add(ca);
        ca = new Card(9, R.drawable.r9); //Ruter 9
        cards.add(ca);
        ca = new Card(10, R.drawable.r10); //Ruter 10
        cards.add(ca);
        ca = new Card(11, R.drawable.rj); //Ruter Knekt
        cards.add(ca);
        ca = new Card(12, R.drawable.rq); //Ruter Dam
        cards.add(ca);
        ca = new Card(13, R.drawable.rk); //Ruter Kung
        cards.add(ca);

        // Hjärter
        ca = new Card(1, R.drawable.sa); //Spader Ess
        cards.add(ca);
        ca = new Card(2, R.drawable.s2); //Spader 2
        cards.add(ca);
        ca = new Card(3, R.drawable.s3); //Spader 3
        cards.add(ca);
        ca = new Card(4, R.drawable.s4); //Spader 4
        cards.add(ca);
        ca = new Card(5, R.drawable.s5); //Spader 5
        cards.add(ca);
        ca = new Card(6, R.drawable.s6); //Spader 6
        cards.add(ca);
        ca = new Card(7, R.drawable.s7); //Spader 7
        cards.add(ca);
        ca = new Card(8, R.drawable.s8); //Spader 8
        cards.add(ca);
        ca = new Card(9, R.drawable.s9); //Spader 9
        cards.add(ca);
        ca = new Card(10, R.drawable.s10); //Spader 10
        cards.add(ca);
        ca = new Card(11, R.drawable.sj); //Spader Knekt
        cards.add(ca);
        ca = new Card(12, R.drawable.sq); //Spader Dam
        cards.add(ca);
        ca = new Card(13, R.drawable.sk); //Spader Kung
        cards.add(ca);


        //Blandar kortleken.
        Collections.shuffle(cards);


        //Delar ut dom första 4 korten som är bortagna från kortleken.
        ca = cards.remove(0);
        nullCard1.setImageResource(ca.image);
        col1.add(0, ca);

        ca = cards.remove(0);
        nullCard2.setImageResource(ca.image);
        col2.add(0, ca);

        ca = cards.remove(0);
        nullCard3.setImageResource(ca.image);
        col3.add(0, ca);

        ca = cards.remove(0);
        nullCard4.setImageResource(ca.image);
        col4.add(0, ca);


        //Blandar kortleken random
        Collections.shuffle(cards);



        while (col1.get(0).value == col2.get(0).value){
            Collections.shuffle(cards);
        }

        while (col1.get(0).value == col3.get(0).value){
            Collections.shuffle(cards);
        }

        while (col1.get(0).value == col4.get(0).value){
            Collections.shuffle(cards);
        }

        while (col2.get(0).value == col3.get(0).value){
            Collections.shuffle(cards);
        }

        while (col2.get(0).value == col4.get(0).value){
            Collections.shuffle(cards);
        }

        while (col3.get(0).value == col4.get(0).value){
            Collections.shuffle(cards);
        }





        bigCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Startar bakgrundsmusiken
                klickSound.start();

                bigCard.startAnimation(anim);

                //Första hämtar bilden till bigCard(stora kortet).
                //Andra tar bort random-kortet.
                Card card = cards.get(0);
                Card scCol1 = cards.remove(0);


                //Visar random-kort i bigCard(stora kortet).
                bigCard.setImageResource(card.image);






                //Algoritmen för att sätta rätt kort på rätt plats.
                //Ifall bigCard(stora kortet) visar matchande kort i arrayen -
                //addera isf ett kort på nästa plats.
                //Kolumn ett!
                if (scCol1.value == col1.get(0).value && col1.size()==1) {
                    col1.add(scCol1);
                    ImageView null5 = (ImageView) findViewById(R.id.nullCard5);
                    null5.setImageResource(scCol1.image);
                    scoreCol1();
                } else if (scCol1.value == col1.get(0).value && col1.size()==2) {
                    col1.add(scCol1);
                    ImageView null9 = (ImageView) findViewById(R.id.nullCard9);
                    null9.setImageResource(scCol1.image);
                    scoreCol2();
                } else if (scCol1.value == col1.get(0).value && col1.size()==3) {
                    col1.add(scCol1);
                    ImageView null9 = (ImageView) findViewById(R.id.nullCard13);
                    null9.setImageResource(scCol1.image);
                    scoreCol3();
                    leftCol4();
                }


                //Kolumn två!
                else if (scCol1.value == col2.get(0).value && col2.size()==1) {
                    col2.add(scCol1);
                    ImageView null6 = (ImageView) findViewById(R.id.nullCard6);
                    null6.setImageResource(scCol1.image);
                    scoreCol1();
                } else if (scCol1.value == col2.get(0).value && col2.size()==2) {
                    col2.add(scCol1);
                    ImageView null9 = (ImageView) findViewById(R.id.nullCard10);
                    null9.setImageResource(scCol1.image);
                    scoreCol2();
                } else if (scCol1.value == col2.get(0).value && col2.size()==3) {
                    col2.add(scCol1);
                    ImageView null9 = (ImageView) findViewById(R.id.nullCard14);
                    null9.setImageResource(scCol1.image);
                    scoreCol3();
                    leftCol4();
                }


                //Kolumn tre!
                else if (scCol1.value == col3.get(0).value && col3.size()==1) {
                    col3.add(scCol1);
                    ImageView null7 = (ImageView) findViewById(R.id.nullCard7);
                    null7.setImageResource(scCol1.image);
                    scoreCol1();
                } else if (scCol1.value == col3.get(0).value && col3.size()==2) {
                    col3.add(scCol1);
                    ImageView null9 = (ImageView) findViewById(R.id.nullCard11);
                    null9.setImageResource(scCol1.image);
                    scoreCol2();
                } else if (scCol1.value == col3.get(0).value && col3.size()==3) {
                    col3.add(scCol1);
                    ImageView null9 = (ImageView) findViewById(R.id.nullCard15);
                    null9.setImageResource(scCol1.image);
                    scoreCol3();
                    leftCol4();
                }


                //Kolumn fyra!
                else if (scCol1.value == col4.get(0).value && col4.size()==1) {
                    col4.add(scCol1);
                    ImageView null8 = (ImageView) findViewById(R.id.nullCard8);
                    null8.setImageResource(scCol1.image);
                    scoreCol1();
                } else if (scCol1.value == col4.get(0).value && col4.size()==2) {
                    col4.add(scCol1);
                    ImageView null9 = (ImageView) findViewById(R.id.nullCard12);
                    null9.setImageResource(scCol1.image);
                    scoreCol2();
                } else if (scCol1.value == col4.get(0).value && col4.size()==3) {
                    col4.add(scCol1);
                    ImageView null9 = (ImageView) findViewById(R.id.nullCard16);
                    null9.setImageResource(scCol1.image);
                    scoreCol3();
                    leftCol4();
                }



                //Räknar ner från 25 till noll.
                leftNum();


                if(klickLeft == 0){
                    Intent gameOver = new Intent(MainActivity.this, GameOver.class);
                    gameOver.putExtra(MESSAGE,scoreCol1.getText().toString());
                    startActivity(gameOver);
                }


                if((col1.size() == 4) && (col2.size() == 4) && (col3.size()==4) && (col4.size()==4)){
                    Intent gameOver = new Intent(MainActivity.this, GameOver.class);
                    gameOver.putExtra(MESSAGE,scoreCol1.getText().toString());
                    startActivity(gameOver);
                }


            }

        });
    }

    @Override
    protected void onPause(){
        super.onPause();
        bgmusic.release();
        finish();
    }


    public void leftNum(){
        //Minus varje gång man klickar!
        klickLeft --;
        left.setText("Left: " + klickLeft);
    }


    public void leftCol4(){
        klickLeft += 2;
    }

    public void scoreCol1(){
        scorePoints += 15;
        scoreCol1.setText("Score: " + scorePoints);
    }

    public void scoreCol2(){
        scorePoints += 30;
        scoreCol1.setText("Score: " + scorePoints);
    }

    public void scoreCol3(){
        scorePoints += 50;
        scoreCol1.setText("Score: " + scorePoints);
    }



    public void gameOver (View v){

        if(klickLeft == 0){
            Intent gameOver = new Intent(MainActivity.this, GameOver.class);
            startActivity(gameOver);
        }

    }


}

