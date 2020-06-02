package com.example.myslots;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;

import static com.example.myslots.MainActivity.KEY_COUNT_BAT;
import static com.example.myslots.MainActivity.KEY_COUNT_CREDIT;
import static com.example.myslots.MainActivity.KEY_WINNER;

public class SuperGame extends AppCompatActivity {

    private TextView total;
    public static TextView winner;
    public static TextView credit;
    private ImageButton[] buttonCard = new ImageButton[5];//{card1, card2, card3, card4, card5};
    private Button select1, select2, select3, select4, select5;
    private Button betOne;
    private Button maxBet;
    private Button start1;
    public static int countBet;
    public static int superWinner;
    public static int countCredit;
    private ArrayList<Card> cloneCards=new ArrayList<Card>(ClassDeck.getCards());
    private Handler mHandler = new Handler();








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_super_game);
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


        countBet=getIntent().getIntExtra(KEY_COUNT_BAT,0);
        countCredit = getIntent().getIntExtra(KEY_COUNT_CREDIT, 0);
        superWinner = getIntent().getIntExtra(KEY_WINNER, 0);
        winner.setText("You win" + superWinner);
        credit.setText("Credit "+ countCredit);
        total.setText("Bet " + countBet);





    }

    public void onClickTextBet(View view) {
    }

    public void onClickWinner(View view) {
    }

    public void onClickCredit(View view) {
    }

    public void onClickC1(View view) {
    }
    Context context = this;
    int duration = Toast.LENGTH_LONG;

    ///////////////////////////////////////////Card2

    public void onClickC2(View view) throws InterruptedException {

        buttonCard[1].setBackgroundResource(cloneCards.get(1).img);

        mHandler.postDelayed(mUpdateTimeTask,1500);
    }

    private Runnable mUpdateTimeTask = new Runnable() {

        @Override
        public void run() {
            Intent intent = new Intent(SuperGame.this, SuperGame.class);

            if(cloneCards.get(1).rang == cloneCards.get(0).rang){

                intent.putExtra(KEY_COUNT_CREDIT, countCredit);
                intent.putExtra(KEY_COUNT_BAT, countBet);
                intent.putExtra(KEY_WINNER, superWinner);
                Toast toast = Toast.makeText(context, "Try again!", duration);
                toast.show();
                startActivity(intent);
            }else
            if(cloneCards.get(1).rang>cloneCards.get(0).rang){

                superWinner = superWinner * 2;
                intent.putExtra(KEY_COUNT_CREDIT, countCredit);
                intent.putExtra(KEY_COUNT_BAT, countBet);
                intent.putExtra(KEY_WINNER, superWinner);
                winner.setText("You winn" + superWinner);
                credit.setText("Credit " + countCredit);
                final Toast toast = Toast.makeText(context, "You win!", duration);
                toast.show();

                startActivity(intent);


            }
            else {
                intent = new Intent(SuperGame.this, MainActivity.class);

                superWinner = 0;
                winner.setText("You lose");
                Toast toast = Toast.makeText(context, "You lose!", duration);
                toast.show();
                intent.putExtra(KEY_COUNT_CREDIT, countCredit);
                intent.putExtra(KEY_COUNT_BAT, countBet);

                startActivity(intent);

            }

        }
    };


//////////////////////////////////////Card3

    public void onClickC3(View view) throws InterruptedException {

        buttonCard[2].setBackgroundResource(cloneCards.get(2).img);

        mHandler.postDelayed(mUpdateTimeTask1,1500);
    }

    private Runnable mUpdateTimeTask1 = new Runnable() {

        @Override
        public void run() {
            Intent intent = new Intent(SuperGame.this, SuperGame.class);

            if(cloneCards.get(2).rang == cloneCards.get(0).rang){

                intent.putExtra(KEY_COUNT_CREDIT, countCredit);
                intent.putExtra(KEY_COUNT_BAT, countBet);
                intent.putExtra(KEY_WINNER, superWinner);
                Toast toast = Toast.makeText(context, "Try again!", duration);
                toast.show();
                startActivity(intent);
            }else
            if(cloneCards.get(2).rang>cloneCards.get(0).rang){
                superWinner = superWinner * 2;
                intent.putExtra(KEY_COUNT_CREDIT, countCredit);
                intent.putExtra(KEY_COUNT_BAT, countBet);
                intent.putExtra(KEY_WINNER, superWinner);
                winner.setText("You winn" + superWinner);
                credit.setText("Credit " + countCredit);
                final Toast toast = Toast.makeText(context, "You win!", duration);
                toast.show();

                startActivity(intent);


            }
            else {
                intent = new Intent(SuperGame.this, MainActivity.class);

                superWinner = 0;
                winner.setText("You lose");
                Toast toast = Toast.makeText(context, "You lose!", duration);
                toast.show();
                intent.putExtra(KEY_COUNT_CREDIT, countCredit);
                intent.putExtra(KEY_COUNT_BAT, countBet);

                startActivity(intent);

            }

        }
    };


///////////////////////////////////////////////Card4


    public void onClickC4(View view) throws InterruptedException {

        buttonCard[3].setBackgroundResource(cloneCards.get(3).img);

        mHandler.postDelayed(mUpdateTimeTask2,1500);
    }


    private Runnable mUpdateTimeTask2 = new Runnable() {

        @Override
        public void run() {
            Intent intent = new Intent(SuperGame.this, SuperGame.class);

            if(cloneCards.get(3).rang == cloneCards.get(0).rang){

                intent.putExtra(KEY_COUNT_CREDIT, countCredit);
                intent.putExtra(KEY_COUNT_BAT, countBet);
                intent.putExtra(KEY_WINNER, superWinner);
                Toast toast = Toast.makeText(context, "Try again!", duration);
                toast.show();
                startActivity(intent);
            }else
            if(cloneCards.get(3).rang>cloneCards.get(0).rang){

                superWinner = superWinner * 2;
                intent.putExtra(KEY_COUNT_CREDIT, countCredit);
                intent.putExtra(KEY_COUNT_BAT, countBet);
                intent.putExtra(KEY_WINNER, superWinner);
                winner.setText("You winn" + superWinner);
                credit.setText("Credit " + countCredit);
                final Toast toast = Toast.makeText(context, "You win!", duration);
                toast.show();

                startActivity(intent);


            }
            else {
                intent = new Intent(SuperGame.this, MainActivity.class);

                superWinner = 0;
                winner.setText("You lose");
                Toast toast = Toast.makeText(context, "You lose!", duration);
                toast.show();
                intent.putExtra(KEY_COUNT_CREDIT, countCredit);
                intent.putExtra(KEY_COUNT_BAT, countBet);

                startActivity(intent);

            }

        }
    };


//////////////////////////////////////////Card5


    public void onClickC5(View view) throws InterruptedException {

        buttonCard[4].setBackgroundResource(cloneCards.get(4).img);

        mHandler.postDelayed(mUpdateTimeTask3,1500);
    }

    private Runnable mUpdateTimeTask3 = new Runnable() {

        @Override
        public void run() {
            Intent intent = new Intent(SuperGame.this, SuperGame.class);

            if(cloneCards.get(4).rang == cloneCards.get(0).rang){

                intent.putExtra(KEY_COUNT_CREDIT, countCredit);
                intent.putExtra(KEY_COUNT_BAT, countBet);
                intent.putExtra(KEY_WINNER, superWinner);
                Toast toast = Toast.makeText(context, "Try again!", duration);
                toast.show();
                startActivity(intent);
            }else
            if(cloneCards.get(4).rang>cloneCards.get(0).rang){

                superWinner = superWinner * 2;
                intent.putExtra(KEY_COUNT_CREDIT, countCredit);
                intent.putExtra(KEY_COUNT_BAT, countBet);
                intent.putExtra(KEY_WINNER, superWinner);
                winner.setText("You winn" + superWinner);
                credit.setText("Credit " + countCredit);
                final Toast toast = Toast.makeText(context, "You win!", duration);
                toast.show();

                startActivity(intent);


            }
            else {
                intent = new Intent(SuperGame.this, MainActivity.class);

                superWinner = 0;
                winner.setText("You lose");
                Toast toast = Toast.makeText(context, "You lose!", duration);
                toast.show();
                intent.putExtra(KEY_COUNT_CREDIT, countCredit);
                intent.putExtra(KEY_COUNT_BAT, countBet);

                startActivity(intent);

            }

        }
    };


    ////////////////////////////////////////////////


    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("credit", countCredit);
        outState.putInt("winner", superWinner);

    }
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        countCredit = savedInstanceState.getInt("credit");
        superWinner = savedInstanceState.getInt("winner");

    }

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

    public void onClickBetOne(View view) {
    }

    public void onClickMaxBet(View view) {
    }

    public void onClickStart(View view) throws InterruptedException {
        countCredit += superWinner;
        Intent intent = new Intent(SuperGame.this, MainActivity.class);
        intent.putExtra(KEY_COUNT_CREDIT, countCredit);
        intent.putExtra(KEY_COUNT_BAT, countBet);
        intent.putExtra(KEY_WINNER, superWinner);
        startActivity(intent);

    }

    @Override
    protected void onResume() {

        super.onResume();
        Collections.shuffle(cloneCards);
       buttonCard[0].setBackgroundResource(cloneCards.get(0).img);


    }


}
