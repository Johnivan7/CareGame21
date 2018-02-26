package com.matskiv;

public class Referee {

    public void compareResults(int scoreOfPlayer, int scoreOfCPU) {
        if (scoreOfPlayer > 21 && scoreOfCPU > 21) {
            System.out.println("You both lost");
        } else if (scoreOfPlayer <= 21 && scoreOfCPU <= 21) {
            if (scoreOfPlayer > scoreOfCPU) {
                System.out.println("Winner is a Player");
                System.out.println("Player scores are " + scoreOfPlayer);
                System.out.println("CPU scores are " + scoreOfCPU);
            } else if (scoreOfPlayer < scoreOfCPU) {
                System.out.println("Winner is a CPU");
                System.out.println("CPU scores are " + scoreOfCPU);
                System.out.println("Player scores are " + scoreOfPlayer);
            } else if (scoreOfPlayer == scoreOfCPU) {
                System.out.println("Equal scores");
                System.out.println("CPU scores are " + scoreOfCPU);
                System.out.println("Player scores are " + scoreOfPlayer);
            }
        } else if (scoreOfPlayer <= 21) {
            {
                System.out.println("Winner is a Player");
                System.out.println("Player scores are " + scoreOfPlayer);
                System.out.println("CPU scores are " + scoreOfCPU);
            }
        } else if (scoreOfCPU <= 21) {
            System.out.println("Winner is a CPU");
            System.out.println("Player scores are " + scoreOfPlayer);
            System.out.println("CPU scores are " + scoreOfCPU);
        }
    }
}
