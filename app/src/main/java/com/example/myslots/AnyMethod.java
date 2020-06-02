package com.example.myslots;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import static com.example.myslots.MainActivity.superWinner;
import static com.example.myslots.SuperGame.credit;
import static com.example.myslots.SuperGame.winner;

public class AnyMethod {

    public static void restartActivity(SuperGame act){

        Intent intent=new Intent();
        intent.setClass(act, act.getClass());
        act.startActivity(intent);
        act.finish();

    }
    public static void runTimer() throws InterruptedException {
        for (int i = superWinner; i !=0 ; i++) {


                    credit.setText("Credit " + SuperGame.countCredit++);
                    winner.setText("You win " + superWinner--);
        }
    }


}
