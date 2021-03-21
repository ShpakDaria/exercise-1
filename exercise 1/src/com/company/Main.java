package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random generator = new Random();
        ArrayList<Cards> deck = new ArrayList<>();//ArrayList<Card> 
        ArrayList<Chelovek> peoples = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        System.out.println("Введите число игроков: ");
        int countPeoples = s.nextInt();

        if (countPeoples > 10) {
            System.out.println("Слишком много игроков, карточек не хватит");
            System.exit(-1);
        }

        for (int i = 0; i < countPeoples; i++) {
            peoples.add(new Chelovek()); 
        }

        for (int i = 0; i < Cards.SUITS_LIST.length; i++) {
            for (int j = 0; j < Cards.RANK_LIST.length; j++) {
                deck.add(new Cards(Cards.SUITS_LIST[i], Cards.RANK_LIST[j]));
            } 
        }

        for (Chelovek c : peoples) {
            for (int i = 0; i < 5; i++) {
                Cards card = deck.get(generator.nextInt(deck.size()));
                c.getCards().add(card);
                deck.remove(card);
            }
        }

        for (Chelovek c : peoples) {
            System.out.println(c.getCards().toString());
        }
        System.out.println("Осталось карт: " + deck.size());
    }
}
