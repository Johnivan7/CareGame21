package com.matskiv;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CPUHand {

    public CPUHand(){
        cPUCardsDeck= new ArrayList<>();
    }
    private List<Cards> cPUCardsDeck;

    public List<Cards> getcPUCardsDeck() {
        return cPUCardsDeck;
    }

    int scoreOfCPU;

    public void getOneCardForCPU(List<Cards> cardDeck, Random random ) {
        int choseCard;
        Cards card;
        choseCard = random.nextInt(cardDeck.size());
        card = cardDeck.get(choseCard);
        cardDeck.remove(choseCard);
        cPUCardsDeck.add(card);
    }

    public void showCPUCardsOnHand() {
        System.out.println("CPU cards on hand:");
        for (int i = 0; i < cPUCardsDeck.size(); i++) {
            System.out.println(cPUCardsDeck.get(i).kind + cPUCardsDeck.get(i).name);
        }
    }

    public void addingValuesCardsCPU(List<Cards> cPUCardsDeck) {
//        int sum = 0;
        this.scoreOfCPU = 0;
        for (int i = 0; i < cPUCardsDeck.size(); i++) {
            scoreOfCPU = scoreOfCPU + cPUCardsDeck.get(i).value;
        }
        System.out.println("CPU score:"+scoreOfCPU);
    }
}