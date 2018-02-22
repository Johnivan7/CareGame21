package com.matskiv;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Deck {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    List<Cards> cardDeck = new ArrayList<>();
    PlayerHand playerHand;
    CPUHand cpuHand;

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
        cardDeck.add(chervi2);
        cardDeck.add(chervi3);
        cardDeck.add(chervi4);
        cardDeck.add(chervi5);
        cardDeck.add(chervi6);
        cardDeck.add(chervi7);
        cardDeck.add(chervi8);
        cardDeck.add(chervi9);
        cardDeck.add(chervi10);
        cardDeck.add(cherviValet);
        cardDeck.add(cherviDama);
        cardDeck.add(cherviKorol);
        cardDeck.add(cherviTyz);
        cardDeck.add(pika2);
        cardDeck.add(pika3);
        cardDeck.add(pika4);
        cardDeck.add(pika5);
        cardDeck.add(pika6);
        cardDeck.add(pika7);
        cardDeck.add(pika8);
        cardDeck.add(pika9);
        cardDeck.add(pika10);
        cardDeck.add(pikaValet);
        cardDeck.add(pikaDama);
        cardDeck.add(pikaKorol);
        cardDeck.add(pikaTyz);
        cardDeck.add(bybnu2);
        cardDeck.add(bybnu3);
        cardDeck.add(bybnu4);
        cardDeck.add(bybnu5);
        cardDeck.add(bybnu6);
        cardDeck.add(bybnu7);
        cardDeck.add(bybnu8);
        cardDeck.add(bybnu9);
        cardDeck.add(bybnu10);
        cardDeck.add(bybnuValet);
        cardDeck.add(bybnuDama);
        cardDeck.add(bybnuKorol);
        cardDeck.add(bybnuTyz);
        cardDeck.add(kresta2);
        cardDeck.add(kresta3);
        cardDeck.add(kresta4);
        cardDeck.add(kresta5);
        cardDeck.add(kresta6);
        cardDeck.add(kresta7);
        cardDeck.add(kresta8);
        cardDeck.add(kresta9);
        cardDeck.add(kresta10);
        cardDeck.add(krestaValet);
        cardDeck.add(krestaDama);
        cardDeck.add(krestaKorol);
        cardDeck.add(krestaTyz);
        System.out.println(cardDeck.size());
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

    public boolean isTrueCommandExitGame(String command) {
        if (command.equals("Exit game")) {
            return true;
        } else {
            return false;
        }
    }

    public void addingValuesCardsPlayer(List<Cards> playerCardsDeck) {
        int sum = 0;
        for (int i = 0; i < playerCardsDeck.size(); i++) {
            sum = sum + playerCardsDeck.get(i).value;
        }
        System.out.println("Player score:"+sum);
    }

    public void addingValuesCardsCPU(List<Cards> cPUCardsDeck) {
        int sum = 0;
        for (int i = 0; i < cPUCardsDeck.size(); i++) {
            sum = sum + cPUCardsDeck.get(i).value;
        }
        System.out.println("CPU score:"+sum);
    }

    public void doingAll() {
        String command = scanner.nextLine();
//        PlayerHand playerHand = new PlayerHand();
        if (isTrueCommandStartGame(command)) {
            createCartDeck();
            playerHand = new PlayerHand();
            cpuHand = new CPUHand();
//            getOneCardForPlayer(playerCardsDeck);
//            getOneCardForPlayer(playerCardsDeck);
            playerHand.getOneCardForPlayerr(cardDeck, random);
            playerHand.getOneCardForPlayerr(cardDeck, random);

            cpuHand.getOneCardForCPU(cardDeck, random);
            cpuHand.getOneCardForCPU(cardDeck, random);
//            showPlayerCardsOnHand(playerCardsDeck);


            playerHand.showPlayerCardsOnHand();
            addingValuesCardsPlayer(playerHand.getPlayerCardsDeck());
            cpuHand.showCPUCardsOnHand();
            addingValuesCardsCPU(cpuHand.getcPUCardsDeck());
            System.out.println(cardDeck.size());
            System.out.println(playerHand.getPlayerCardsDeck().size());
            System.out.println(cpuHand.getcPUCardsDeck().size());
        }
        else if (isTrueCommandGetOneCardPlayer(command)) {
            playerHand.getOneCardForPlayerr(cardDeck,random);
            playerHand.showPlayerCardsOnHand();
            addingValuesCardsPlayer(playerHand.getPlayerCardsDeck());
            System.out.println(cardDeck.size());
            System.out.println(playerHand.getPlayerCardsDeck().size());
            System.out.println(cpuHand.getcPUCardsDeck().size());
        } else if (isTrueCommandGetOneCardCPU(command)) {
            cpuHand.getOneCardForCPU(cardDeck,random);
            cpuHand.showCPUCardsOnHand();
            addingValuesCardsCPU(cpuHand.getcPUCardsDeck());
            System.out.println(cardDeck.size());
            System.out.println(playerHand.getPlayerCardsDeck().size());
            System.out.println(cpuHand.getcPUCardsDeck().size());
        } else if(isTrueCommandExitGame(command)){
            cardDeck.clear();
            playerHand.getPlayerCardsDeck().clear();
            cpuHand.getcPUCardsDeck().clear(); }
            else {
            System.out.println("You entered invalid information");
        }
    }
}