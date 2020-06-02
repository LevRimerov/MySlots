package com.example.myslots;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameLogical {
    public static Card[] five = new Card[5];
    public static ArrayList<Integer> cardRang = new ArrayList<>();
    public static ArrayList<Integer> cardKlass = new ArrayList<>();
    public static Map<Integer, Integer> mapRang = new HashMap<>();
    public static Map<Integer, Integer> mapKlass = new HashMap<>();
    public static int hand;
    public static Toast toast;
    public static String text;
    public static Integer duratation = Toast.LENGTH_LONG;
    public static int xBet;

    public static String handToString(int hand) {
        switch (hand) {
            case 0:
                return "Bust ";
            case 1:
                return "Pair ";
            case 2:
                return "Two Pair ";
            case 3:
                return "3 of a Kind ";
            case 4:
                return "Straight ";
            case 5:
                return "Flush ";
            case 6:
                return "Full House ";
            case 7:
                return "4 of a Kind ";
            case 8:
                return "Straight Flush ";
            case 9:
                return "Royal Flush ";
            default:
                return "Error ";
        }
    }

    public static int searchHand() {
        xBet=0;
        cardRang.clear();
        cardKlass.clear();
        mapRang.clear();
        mapKlass.clear();

        for (int i = 0; i < five.length; i++) {
            cardRang.add(i, five[i].rang);
            cardKlass.add(i, five[i].klass);
            mapRang.put(five[i].rang, null);
            mapKlass.put(five[i].klass, null);
        }
        Collections.sort(cardKlass);
        Collections.sort(cardRang);
        if(           //check RoyalFlush
                (cardRang.get(0)==10)
                        &&
                        (cardRang.get(1)==11)
                        &&
                        (cardRang.get(2)==12)
                        &&
                        (cardRang.get(3)==13)
                        &&
                        (cardRang.get(4)==14)
                        &&
                        (mapKlass.size()==1))
        {
            hand = 9;
            xBet=100;
        }
        else
        if (       //check SraitFlush
                        (cardRang.get(0) == (cardRang.get(1) - 1))
                        &&
                        (cardRang.get(1)== (cardRang.get(2) - 1))
                        &&
                        (cardRang.get(2) == (cardRang.get(3) - 1))
                        &&
                        (cardRang.get(3) == (cardRang.get(4) - 1))
                        && (mapKlass.size() == 1))
        {
                hand = 8;
                xBet = 80;

        }
        else
        if (    // check 4 of a Kind
                        ((cardRang.get(0) == cardRang.get(1))
                        &&
                        (cardRang.get(0) == cardRang.get(2))
                        &&
                        (cardRang.get(0) == cardRang.get(3))
                        &&
                        (mapKlass.size() == 4)
                        &&
                        (mapRang.size() == 2))
                        ||
                        ((cardRang.get(1) == cardRang.get(2))
                        &&
                        (cardRang.get(1) == cardRang.get(3))
                        &&
                        (cardRang.get(1) == cardRang.get(4))
                        &&
                        (mapKlass.size() == 4)
                        &&
                        (mapRang.size() == 2)))
        {
                        hand = 7;
                        xBet = 70;

        }
        else
        if (        //check Full House
                        ((cardRang.get(0) == cardRang.get(1))
                        &&
                        (cardRang.get(1) == cardRang.get(2))
                        &&
                        (cardRang.get(3) == cardRang.get(4)))
                        ||
                        ((cardRang.get(0) == cardRang.get(1))
                        &&
                        (cardRang.get(2) == cardRang.get(3))
                        &&
                        (cardRang.get(3) == cardRang.get(4))))
        {

                    hand = 6;
                    xBet = 60;

        }
        else
        if (         //check Flush
                        (mapRang.size() == 5)
                        &&
                        (mapKlass.size() == 1))
        {
            hand = 5;
            xBet = 50;
        }
        else
        if (    //check Strait
                        (cardRang.get(0) == (cardRang.get(1) - 1))
                        &&
                        (cardRang.get(0) == (cardRang.get(2) - 2))
                        &&
                        (cardRang.get(0) == (cardRang.get(3) - 3))
                        &&
                        (cardRang.get(0) == (cardRang.get(4) - 4)
                        &&
                        (mapKlass.size() != 5)))
        {
            hand = 4;
            xBet = 40;
        }
        else
        if (         //check Three of a King
                        (cardRang.get(0) == cardRang.get(1))
                        &&
                        (cardRang.get(1) == cardRang.get(2))
                        ||
                        (cardRang.get(1) == cardRang.get(2))
                        &&
                        (cardRang.get(2) == cardRang.get(3))
                        ||
                        (cardRang.get(2)==cardRang.get(3))
                        &&
                        (cardRang.get(3)==cardRang.get(4)))
        {
            hand = 3;
            xBet = 30;
        }
        else//check Two pair
        if (
                ((cardRang.get(0) == cardRang.get(1))
                        &&
                (cardRang.get(2)==cardRang.get(3)))
                        ||
                ((cardRang.get(1)==cardRang.get(2))
                        &&
                (cardRang.get(3)==cardRang.get(4)))
                        ||
                ((cardRang.get(0)==cardRang.get(1))
                        &&
                (cardRang.get(3)==cardRang.get(4))))
        {
            hand = 2;
            xBet = 20;
        }
        else  // check One Pair
        if (
                    (cardRang.get(0) == cardRang.get(1))
                            ||
                    (cardRang.get(1 )== cardRang.get(2))
                            ||
                    (cardRang.get(2) ==cardRang.get(3))
                            ||
                    (cardRang.get(3)==cardRang.get(4)))
        {
                hand = 1;
                xBet = 10;
        }return hand;
//        else
//        if(
//                    (cardRang.get(4)>cardRang.get(3))
//                    &&
//                    (cardRang.get(4)>cardRang.get(2))
//                    &&
//                    (cardRang.get(4)>cardRang.get(1))
//                    &&
//                    (cardRang.get(4)>cardRang.get(0)))
//        {
//                hand = 0;
//                xBet = 5;
//        }
    }

}


