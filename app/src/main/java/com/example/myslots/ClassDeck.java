package com.example.myslots;

import java.util.ArrayList;
import java.util.List;

public class ClassDeck {
    public static Card rubashka = new Card("rubashka", 0, R.drawable.rubashka, 0);
     public static List<Card>  getCards(){


         List<Card> cardList = new ArrayList<>();

         cardList.add(new Card("Ace", 1, R.drawable.heard_ace, 14));//Heard = 1
         cardList.add(new Card("Ace", 2, R.drawable.tref_ace, 14));//Tref = 2
         cardList.add(new Card("Ace", 3, R.drawable.bubi_ace, 14));// Bubi = 3
         cardList.add(new Card("Ace", 4, R.drawable.tuz_pic, 14));// Piki = 4
         cardList.add(new Card("King", 1, R.drawable.heard_king, 13));
         cardList.add(new Card("King", 2, R.drawable.tref_king, 13));
         cardList.add(new Card("King", 3, R.drawable.bubi_king, 13));
         cardList.add(new Card("King", 4, R.drawable.pick_king, 13));
         cardList.add(new Card("Queen", 1, R.drawable.heard_queen, 12));
         cardList.add(new Card("Queen", 2, R.drawable.tref_queen, 12));
         cardList.add(new Card("Queen", 3, R.drawable.bubi_queen, 12));
         cardList.add(new Card("Queen", 4, R.drawable.pick_queen, 12));
         cardList.add(new Card("Jack", 1, R.drawable.heard_jack, 11));
         cardList.add(new Card("Jack", 2, R.drawable.tref_jack, 11));
         cardList.add(new Card("Jack", 3, R.drawable.bubi_jack, 11));
         cardList.add(new Card("Jack", 4, R.drawable.pic_jack, 11));
         cardList.add(new Card("10", 1, R.drawable.heard_ten, 10));
         cardList.add(new Card("10", 2, R.drawable.tref_ten, 10));
         cardList.add(new Card("10", 3, R.drawable.bubi_ten, 10));
         cardList.add(new Card("10", 4, R.drawable.pic_ten, 10));
         cardList.add(new Card("9", 1, R.drawable.heard_nine, 9));
         cardList.add(new Card("9", 2, R.drawable.tref_nine, 9));
         cardList.add(new Card("9", 3, R.drawable.bubi_nine, 9));
         cardList.add(new Card("9", 4, R.drawable.pic_nine, 9));
         cardList.add(new Card("8", 1, R.drawable.heard_eight, 8));
         cardList.add(new Card("8", 2, R.drawable.tref_eight, 8));
         cardList.add(new Card("8", 3, R.drawable.bubi_eight, 8));
         cardList.add(new Card("8", 4, R.drawable.pic_eight, 8));
         cardList.add(new Card("7", 1, R.drawable.heard_seven, 7));
         cardList.add(new Card("7", 2, R.drawable.tref_seven, 7));
         cardList.add(new Card("7", 3, R.drawable.bubi_seven, 7));
         cardList.add(new Card("7", 4, R.drawable.pic_seven, 7));
         cardList.add(new Card("6", 1, R.drawable.heard_six, 6));
         cardList.add(new Card("6", 2, R.drawable.tref_six, 6));
         cardList.add(new Card("6", 3, R.drawable.bubi_six, 6));
         cardList.add(new Card("6", 4, R.drawable.pic_six, 6));
         cardList.add(new Card("5", 1, R.drawable.heard_five, 5));
         cardList.add(new Card("5", 2, R.drawable.tref_five, 5));
         cardList.add(new Card("5", 3, R.drawable.bubi_five, 5));
         cardList.add(new Card("5", 4, R.drawable.pic_five, 5));
         cardList.add(new Card("4", 1, R.drawable.heard_four, 4));
         cardList.add(new Card("4", 2, R.drawable.tref_four, 4));
         cardList.add(new Card("4", 3, R.drawable.bubi_four, 4));
         cardList.add(new Card("4", 4, R.drawable.pic_five, 4));
         cardList.add(new Card("3", 1, R.drawable.heard_three, 3));
         cardList.add(new Card("3", 2, R.drawable.tref__three, 3));
         cardList.add(new Card("3", 3, R.drawable.bubi_three, 3));
         cardList.add(new Card("3", 4, R.drawable.pic_three, 3));
         cardList.add(new Card("2", 1, R.drawable.heard_two, 2));
         cardList.add(new Card("2", 2, R.drawable.tref_two, 2));
         cardList.add(new Card("2", 3, R.drawable.bubi_two, 2));
         cardList.add(new Card("2", 4, R.drawable.pic_two, 2));

         return cardList;


     }


}