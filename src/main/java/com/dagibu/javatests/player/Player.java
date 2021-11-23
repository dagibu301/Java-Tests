package com.dagibu.javatests.player;

public class Player {

    private Dice dice;
    private int myNumberToWin;

    public Player(Dice dice, int myNumberToWin) {
        this.dice = dice;
        this.myNumberToWin = myNumberToWin;
    }

    public boolean play() {
        int diceNumber = dice.roll();
        return diceNumber > myNumberToWin;
    }
}
