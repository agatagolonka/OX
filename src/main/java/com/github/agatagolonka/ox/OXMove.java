package com.github.agatagolonka.ox;

class OXMove {

    private final char[] signs;
    private char actualSign;

    public OXMove(char[] signs) {
        this.signs = signs;
        this.actualSign = signs[0];
    }

    public char getSign() {
        return this.actualSign;
    }


    public void changePlayer() {
        this.actualSign = (this.actualSign == signs[0]) ? signs[1] : signs[0];
    }
}
