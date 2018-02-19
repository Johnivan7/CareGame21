package com.matskiv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.createCartDeck();

        while (true) {
            deck.doingAll();
        }
    }
}


