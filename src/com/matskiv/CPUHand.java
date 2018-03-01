package com.matskiv;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CPUHand extends GameHand{
    @Override
    public void showDecksOnHand() {
        System.out.println("CPU cards on hand:");
        super.showDecksOnHand();
    }

    @Override
    public void addingValuesCardsHand(List<Cards> cPUCardsDeck) {
        super.addingValuesCardsHand(cPUCardsDeck);
        System.out.println("CPU score:"+scoreOfHand);
    }
}