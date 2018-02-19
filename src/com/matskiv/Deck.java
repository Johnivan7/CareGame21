package com.matskiv;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Deck {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    List<Cards> cartDeck = new ArrayList<>();
    PlayerDeck playerDeck = new PlayerDeck();
    CPUDeck cpuDeck = new CPUDeck();

    Cards chervi2 = new Cards("chervi", 2, "2");
    Cards chervi3 = new Cards("chervi", 3, "3");
    Cards chervi4 = new Cards("chervi", 4, "4");
    Cards chervi5 = new Cards("chervi", 5, "5");
    Cards chervi6 = new Cards("chervi", 6, "6");
    Cards chervi7 = new Cards("chervi", 7, "7");
    Cards chervi8 = new Cards("chervi", 8, "8");
    Cards chervi9 = new Cards("chervi", 9, "9");
    Cards chervi10 = new Cards("chervi", 10, "10");
    Cards pika2 = new Cards("pika", 2, "2");
    Cards pika3 = new Cards("pika", 3, "3");
    Cards pika4 = new Cards("pika", 4, "4");
    Cards pika5 = new Cards("pika", 5, "5");
    Cards pika6 = new Cards("pika", 6, "6");
    Cards pika7 = new Cards("pikai", 7, "7");
    Cards pika8 = new Cards("pika", 8, "8");
    Cards pika9 = new Cards("pika", 9, "9");
    Cards pika10 = new Cards("pika", 10, "10");
    Cards bybnu2 = new Cards("bybnu", 2, "2");
    Cards bybnu3 = new Cards("bybnu", 3, "3");
    Cards bybnu4 = new Cards("bybnu", 4, "4");
    Cards bybnu5 = new Cards("bybnu", 5, "5");
    Cards bybnu6 = new Cards("bybnu", 6, "6");
    Cards bybnu7 = new Cards("bybnu", 7, "7");
    Cards bybnu8 = new Cards("bybnu", 8, "8");
    Cards bybnu9 = new Cards("bybnu", 9, "9");
    Cards bybnu10 = new Cards("bybnu", 10, "10");
    Cards kresta2 = new Cards("kresta", 2, "2");
    Cards kresta3 = new Cards("kresta", 3, "3");
    Cards kresta4 = new Cards("kresta", 4, "4");
    Cards kresta5 = new Cards("kresta", 5, "5");
    Cards kresta6 = new Cards("kresta", 6, "6");
    Cards kresta7 = new Cards("kresta", 7, "7");
    Cards kresta8 = new Cards("kresta", 8, "8");
    Cards kresta9 = new Cards("kresta", 9, "9");
    Cards kresta10 = new Cards("kresta", 10, "10");
    Cards cherviValet = new Cards("chervi", 2, "valet");
    Cards cherviDama = new Cards("chervi", 3, "dama");
    Cards cherviKorol = new Cards("chervi", 4, "korol");
    Cards cherviTyz = new Cards("chervi", 11, "tyz");
    Cards pikaValet = new Cards("pika", 2, "valet");
    Cards pikaDama = new Cards("pika", 3, "dama");
    Cards pikaKorol = new Cards("pika", 4, "korol");
    Cards pikaTyz = new Cards("chervi", 11, "tyz");
    Cards bybnuValet = new Cards("bybnu", 2, "valet");
    Cards bybnuDama = new Cards("bybnu", 3, "dama");
    Cards bybnuKorol = new Cards("bybnu", 4, "korol");
    Cards bybnuTyz = new Cards("bybnu", 11, "tyz");
    Cards krestaValet = new Cards("kresta", 2, "valet");
    Cards krestaDama = new Cards("kresta", 3, "dama");
    Cards krestaKorol = new Cards("kresta", 4, "korol");
    Cards krestaTyz = new Cards("kresta", 11, "tyz");

    public void createCartDeck() {

        cartDeck.add(chervi2);
        cartDeck.add(chervi3);
        cartDeck.add(chervi4);
        cartDeck.add(chervi5);
        cartDeck.add(chervi6);
        cartDeck.add(chervi7);
        cartDeck.add(chervi8);
        cartDeck.add(chervi9);
        cartDeck.add(chervi10);
        cartDeck.add(cherviValet);
        cartDeck.add(cherviDama);
        cartDeck.add(cherviKorol);
        cartDeck.add(cherviTyz);
        cartDeck.add(pika2);
        cartDeck.add(pika3);
        cartDeck.add(pika4);
        cartDeck.add(pika5);
        cartDeck.add(pika6);
        cartDeck.add(pika7);
        cartDeck.add(pika8);
        cartDeck.add(pika9);
        cartDeck.add(pika10);
        cartDeck.add(pikaValet);
        cartDeck.add(pikaDama);
        cartDeck.add(pikaKorol);
        cartDeck.add(pikaTyz);
        cartDeck.add(bybnu2);
        cartDeck.add(bybnu3);
        cartDeck.add(bybnu4);
        cartDeck.add(bybnu5);
        cartDeck.add(bybnu6);
        cartDeck.add(bybnu7);
        cartDeck.add(bybnu8);
        cartDeck.add(bybnu9);
        cartDeck.add(bybnu10);
        cartDeck.add(bybnuValet);
        cartDeck.add(bybnuDama);
        cartDeck.add(bybnuKorol);
        cartDeck.add(bybnuTyz);
        cartDeck.add(kresta2);
        cartDeck.add(kresta3);
        cartDeck.add(kresta4);
        cartDeck.add(kresta5);
        cartDeck.add(kresta6);
        cartDeck.add(kresta7);
        cartDeck.add(kresta8);
        cartDeck.add(kresta9);
        cartDeck.add(kresta10);
        cartDeck.add(krestaValet);
        cartDeck.add(krestaDama);
        cartDeck.add(krestaKorol);
        cartDeck.add(krestaTyz);
        System.out.println(cartDeck.size());
    }

    public boolean isTrueCommandStartGame(String command) {
        if (command.equals("Start a game")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isTrueCommandGetOneCardPlayer(String command) {
        if (command.equals("Get one card for player")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isTrueCommandGetOneCardCPU(String command) {
        if (command.equals("Get one card for CPU")) {
            return true;
        } else {
            return false;
        }
    }

    public void getOneCardForCPU() {
        int choseCard;
        Cards card;
        choseCard = random.nextInt(cartDeck.size());
        card = cartDeck.get(choseCard);
        cartDeck.remove(choseCard);
        cpuDeck.cPUCardsDeck.add(card);
    }

    public void getOneCardForPlayer() {
        int choseCard;
        Cards card;
        choseCard = random.nextInt(cartDeck.size());
        card = cartDeck.get(choseCard);
        cartDeck.remove(choseCard);
        playerDeck.playerCardsDeck.add(card);
    }

    public void doingAll() {
        String command = scanner.nextLine();
        if (isTrueCommandStartGame(command)) {
            getOneCardForPlayer();
            getOneCardForPlayer();
            getOneCardForCPU();
            getOneCardForCPU();
            System.out.println(cartDeck.size());
            System.out.println(playerDeck.playerCardsDeck.size());
            System.out.println(cpuDeck.cPUCardsDeck.size());
            for(int i =0; i<playerDeck.playerCardsDeck.size(); i++) {
                System.out.println(playerDeck.playerCardsDeck.get(i).kind + playerDeck.playerCardsDeck.get(i).name);
            }
            for(int i=0; i<cpuDeck.cPUCardsDeck.size();i++){
                System.out.println(cpuDeck.cPUCardsDeck.get(i).kind+cpuDeck.cPUCardsDeck.get(i).name);}}
        else if (isTrueCommandGetOneCardPlayer(command)) {
            getOneCardForPlayer();
            System.out.println(cartDeck.size());
            System.out.println(playerDeck.playerCardsDeck.size());
            System.out.println(cpuDeck.cPUCardsDeck.size());
        } else if (isTrueCommandGetOneCardCPU(command)) {
            getOneCardForCPU();
            System.out.println(cartDeck.size());
            System.out.println(playerDeck.playerCardsDeck.size());
            System.out.println(cpuDeck.cPUCardsDeck.size());
        } else {
            System.out.println("You entered invalid information");
        }
    }
}