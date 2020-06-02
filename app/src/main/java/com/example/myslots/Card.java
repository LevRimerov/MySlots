package com.example.myslots;

public class Card {
   public String name;
    public int klass;
    public int img;
    public int rang;

    public Card(String name, int klass, int img, int rang) {
        this.name = name;
        this.klass = klass;
        this.img = img;
        this.rang = rang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKlass(){
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
    public int getImg() {
        return img;
    }
    public void setImg(int img) {
        this.img = img;
    }


    public void setRang(int rang){
        this.rang=rang;
    }public int getRang() {
        return img;
    }


}
