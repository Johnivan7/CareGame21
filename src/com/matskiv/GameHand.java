package com.matskiv;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class GameHand {
    public GameHand(){
        handDeck= new ArrayList<>();
    }
    private List<Cards> handDeck;

    public List<Cards> getHandDeck() {
        return handDeck;
    }

    protected int scoreOfHand;

    public void getOneCardForHand(List<Cards> cardDeck, Random random ) {
        int choseCard;
        Cards card;
        choseCard = random.nextInt(cardDeck.size());
        card = cardDeck.get(choseCard);
        cardDeck.remove(choseCard);
        handDeck.add(card);
    }

    public void showDecksOnHand() {
        for (int i = 0; i < handDeck.size(); i++) {
            System.out.println(handDeck.get(i).kind + handDeck.get(i).name);
        }
    }

    public void addingValuesCardsHand(List<Cards> cPUCardsDeck) {
        this.scoreOfHand = 0;
        for (int i = 0; i < cPUCardsDeck.size(); i++) {
            scoreOfHand = scoreOfHand + cPUCardsDeck.get(i).value;
        }
    }
}
