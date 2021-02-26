package com.github.agatagolonka.OX;

public class OXMove {

    private char sign;

    public OXMove() {
    }

    public char getSign() {
        return this.sign;
    }

    public void setSign(char sign) {

        this.sign = sign;
    }

    public void changePlayer() {
        this.sign = (this.sign == 'o') ? 'x' : 'o';
    }
}
