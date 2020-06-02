package com.example.myslots;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static android.os.Build.VERSION_CODES.O;


public  class MainActivity extends AppCompatActivity {
    private TextView total;
    private TextView winner;
    private TextView credit;
    private ImageButton[] buttonCard = new ImageButton[5];//{card1, card2, card3, card4, card5};
    private Button select1, select2, select3, select4, select5;
    private Button betOne;
    private Button maxBet;
    private Button start1;
    public static int countBet;
    public static int countCredit;
    private ArrayList<Card> cloneCards=new ArrayList<Card>(ClassDeck.getCards());
    private ArrayList<Card> choosenCards=new ArrayList<Card>();
    boolean[] isShutle={true,true, true,true,true};
    public static int superWinner;
    public static final String KEY_COUNT_BAT="COUNT BAT";
    public static final String KEY_COUNT_CREDIT="COUNT CREDIT";
    public static final String KEY_WINNER ="COUNT INNER";
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        requestWindowFeature(Window.FEATURE_NO_TITLE); // << это вставить именно сюда
//        setContentView(R.layout.about_screen);// << это есть
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        total = findViewById(R.id.total);
        winner = findViewById(R.id.winer);
        credit = findViewById(R.id.credit);
        buttonCard[0] = findViewById(R.id.card1);
        buttonCard[1] = findViewById(R.id.card2);
        buttonCard[2] = findViewById(R.id.card3);
        buttonCard[3] = findViewById(R.id.card4);
        buttonCard[4] = findViewById(R.id.card5);
        select1 = findViewById(R.id.select1);
        select2 = findViewById(R.id.select2);
        select3 = findViewById(R.id.select3);
        select4 = findViewById(R.id.select4);
        select5 = findViewById(R.id.select5);
        betOne = findViewById(R.id.betOne);
        maxBet = findViewById(R.id.betMax);
        start1 = findViewById(R.id.start);
        superWinner = countBet * GameLogical.xBet;
       // credit.setText(countCredit);
        countBet=getIntent().getIntExtra(MainActivity.KEY_COUNT_BAT,0);
        countCredit = getIntent().getIntExtra(MainActivity.KEY_COUNT_CREDIT, 0);
        total.setText("Total Bet " + countBet);
        credit.setText("Credit "+ countCredit);

    }





    // SetText Views

    public void onClickTextBet(View view) {
    }
    public void onClickWinner(View view) {

    }
    public void onClickCredit(View view) {
        countCredit = 1000;
        credit.setText("Credit " + countCredit);
        if(counter==1){
            countCredit = countCredit - countBet;
            credit.setText("Credit " + countCredit);
        }

    }


    // ButtonCards

    public void onClickC1(View view)
    {
        if(isShutle[0]) {
            isShutle[0] = false;
            choosenCards.add(GameLogical.five[0]);
            select1.setVisibility(View.VISIBLE);
        }
        else{
            isShutle[0] = true;
            choosenCards.remove(GameLogical.five[0]);
            select1.setVisibility(View.INVISIBLE);
        }

    }
    public void onClickC2(View view) {
        if (isShutle[1]){
            isShutle[1]=false;
            choosenCards.add(GameLogical.five[1]);
            select2.setVisibility(View.VISIBLE);
        }else {
            isShutle[1]=true;
            choosenCards.remove(GameLogical.five[1]);
            select2.setVisibility(View.INVISIBLE);
        }
    }
    public void onClickC3(View view) {
        if(isShutle[2]){
            isShutle[2]=false;
            choosenCards.add(GameLogical.five[2]);
            select3.setVisibility(View.VISIBLE);
        }else{
            isShutle[2]=true;
            choosenCards.remove(GameLogical.five[2]);
            select3.setVisibility(View.INVISIBLE);
        }

    }
    public void onClickC4(View view){
        if(isShutle[3]){
            isShutle[3]=false;
            choosenCards.add(GameLogical.five[3]);
            select4.setVisibility(View.VISIBLE);
        }else{
            isShutle[3]=true;
            choosenCards.remove(GameLogical.five[3]);
            select4.setVisibility(View.INVISIBLE);
        }
    }
    public void onClickC5(View view){
        if(isShutle[4]){
            isShutle[4]=false;
            choosenCards.add(GameLogical.five[4]);
            select5.setVisibility(View.VISIBLE);
        }else{
            isShutle[4]=true;
            choosenCards.remove(GameLogical.five[4]);
            select5.setVisibility(View.INVISIBLE);
        }
    }

    //ButtonsSell

    public void onClickSel1(View view) {

    }

    public void onClickSel2(View view) {
    }

    public void onClickSel3(View view) {
    }

    public void onClickSel4(View view) {
    }

    public void onClickSel5(View view) {
    }

    //ButtonskCounter

    public void onClickBetOne(View view) {
        countBet++;
        if(countBet>25){
            countBet = 0;
        }
        total.setText("Total Bet " + countBet);

    }



    public void onClickStart(View view) {
        counter++;
        Intent intent = new Intent(MainActivity.this, MainActivity.class);

        if(counter == 1){
            countCredit = countCredit - countBet;
            credit.setText("Credit " + countCredit);
        }
        if(counter<3){
                cloneCards=new ArrayList<Card>(ClassDeck.getCards());

                for(int i=0; i<choosenCards.size();i++){

                    cloneCards.remove(choosenCards.get(i));
                }

                for(int i=0; i<isShutle.length;i++){
                    if(isShutle[i]){

                        Collections.shuffle(cloneCards);
                        buttonCard[i].setBackgroundResource(cloneCards.get(0).img);
                        GameLogical.five[i] = cloneCards.get(0);
                        cloneCards.remove(0);
                    }

                }
             if(counter == 2 && GameLogical.xBet!=0){
                 maxBet.setText("Double");

             }

        }if(counter == 3){
            if(superWinner!=0){
                for (int i = 0; i <superWinner ; i++) {

                    credit.setText("Credit " + (countCredit+superWinner));

                    winner.setText("You win " + superWinner);
                }
                countCredit = countCredit + superWinner;
                superWinner = 0;

            }
            intent.putExtra(KEY_COUNT_BAT, countBet);
            intent.putExtra(KEY_COUNT_CREDIT, countCredit);


            startActivity(intent);
        }

        GameLogical.searchHand();
        winner.setText("You win " + (countBet*GameLogical.xBet));
    }

    public void onClickMaxBet(View view) {
        if(!maxBet.getText().equals("Double")) {
            countBet = 25;
            total.setText("Total Bet " + countBet);
        }
        if(counter == 2 && GameLogical.xBet!=0){

            Intent intent = new Intent(MainActivity.this, SuperGame.class);
            superWinner=countBet*GameLogical.xBet;
            intent.putExtra(KEY_COUNT_BAT, countBet);
            intent.putExtra(KEY_COUNT_CREDIT, countCredit);
            intent.putExtra(KEY_WINNER, superWinner);
            startActivity(intent);
        }
    }


//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putInt("credit", countCredit);
//        outState.putInt("winner", superWinner);
//
//    }
//    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        countCredit = savedInstanceState.getInt("credit");
//        superWinner = savedInstanceState.getInt("winner");
//
//    }


}
