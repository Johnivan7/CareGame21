package com.matskiv;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayerHand {

    public PlayerHand(){
        playerCardsDeck = new ArrayList<>();
    }

    public List<Cards> getPlayerCardsDeck(){
        return playerCardsDeck;
    }

    private List<Cards> playerCardsDeck;// = new ArrayList<>();

    public void getOneCardForPlayerr(List<Cards> cartDeck, Random random ) {
        int choseCardPosition;
        Cards card;
        choseCardPosition = random.nextInt(cartDeck.size());
        card = cartDeck.get(choseCardPosition);
        cartDeck.remove(choseCardPosition);
        playerCardsDeck.add(card);
        System.out.println("current deck size: "+cartDeck.size());
        System.out.println("current player hand size: "+playerCardsDeck.size());
        System.out.println("Player cards on hand:");
        for (int i = 0; i < playerCardsDeck.size(); i++) {
            System.out.println(playerCardsDeck.get(i).kind + playerCardsDeck.get(i).name);
        }
    }

    public void showPlayerCardsOnHand() {
        System.out.println("Player cards on hand:");
        for (int i = 0; i < playerCardsDeck.size(); i++) {
            System.out.println(playerCardsDeck.get(i).kind + playerCardsDeck.get(i).name);
        }
    }
}