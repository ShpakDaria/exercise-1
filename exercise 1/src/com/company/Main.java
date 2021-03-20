package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random generator = new Random();
        ArrayList<Cards> deck = new ArrayList<>();//ArrayList<Card> - масив карт3
        ArrayList<Chelovek> peoples = new ArrayList<>();

        Scanner s = new Scanner(System.in);//создаём новый элемент класса который будет вводиться с консоли количество игроков
        System.out.println("Введите число игроков: ");
        int countPeoples = s.nextInt();// nextInt() это метод класса Scanner

        if (countPeoples > 10) {
            System.out.println("Слишком много игроков, карточек не хватит");
            System.exit(-1);
        }

        for (int i = 0; i < countPeoples; i++) {
            peoples.add(new Chelovek()); // загружаем количество людей определённых ранее в масив
        }

        for (int i = 0; i < Cards.SUITS_LIST.length; i++) {
            for (int j = 0; j < Cards.RANK_LIST.length; j++) {
                deck.add(new Cards(Cards.SUITS_LIST[i], Cards.RANK_LIST[j]));
            } // перебераем карты и добавляем их в колоду
        }

        for (Chelovek c : peoples) { // перебирая масив людей мы присваеваем значение "с" определённому человеку, так продвигаемся по всему масиву
            for (int i = 0; i < 5; i++) {
                Cards card = deck.get(generator.nextInt(deck.size()));//nextInt - случайное число от 0 до размера колоды текущего
                c.getCards().add(card);//getCards()- текущий список кард, add(card)- добавляет новую случайную карту
                deck.remove(card);
            }
        }

        for (Chelovek c : peoples) {
            System.out.println(c.getCards().toString());// getCards().toString() список кард преобразуеться в формат строки
        }
        System.out.println("Осталось карт: " + deck.size());
    }
}
