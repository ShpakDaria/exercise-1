package com.company;

import java.util.ArrayList;

public class Chelovek {
    ArrayList<Cards> cards;

    public Chelovek() {
cards = new ArrayList<>();
    }

    public ArrayList<Cards> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Cards> cards) {
        this.cards = cards;
    }
}
