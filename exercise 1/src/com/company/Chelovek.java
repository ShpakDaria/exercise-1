package com.company;

import java.util.ArrayList;

public class Chelovek {
    ArrayList<Cards> cards;

    public Chelovek() {
cards = new ArrayList<>();
    }

    public ArrayList<Cards> getCards() {
        return cards;
    }//возвращает масив карт человека

    public void setCards(ArrayList<Cards> cards) {
        this.cards = cards;
    }//задать список карт который есть у челоека
}
