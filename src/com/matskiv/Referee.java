package com.matskiv;

public class Referee {

    public String compareResults(int scoreOfPlayer, int scoreOfCPU) {
        if (scoreOfPlayer > 21 && scoreOfCPU > 21) {
            return "draw";
        } else if (scoreOfPlayer <= 21 && scoreOfCPU <= 21) {
            if (scoreOfPlayer > scoreOfCPU) {
                return "player";
            } else if (scoreOfPlayer < scoreOfCPU) {
                return "cpu";
            } else if (scoreOfPlayer == scoreOfCPU) {
                return "draw";
            }
        } else if (scoreOfPlayer <= 21) {
            {
                return "player";
            }
        } else if (scoreOfCPU <= 21) {
            return "cpu";}
            return "You dont write correct code for choose a winner";
    }
}
