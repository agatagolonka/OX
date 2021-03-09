package com.github.agatagolonka.OX;

public class OXMove {

    private char sign;

    public OXMove(char sign) {
        this.sign=sign;
    }

    public char getSign() {
        return this.sign;
    }


    public void changePlayer() {
        this.sign = (this.sign == 'o') ? 'x' : 'o';
    }
}
