package com.github.agatagolonka.ox;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class OXVictoryCondition {

    private final int size;
    List<Character> boardToVictoryCondition;
    Boolean isWinner = false;

    public OXVictoryCondition(int size) {
        this.size = size;
        this.boardToVictoryCondition = IntStream.rangeClosed(1, size * size).boxed()
                .map(i -> Character.forDigit(i, size * size + 1))
                .collect(Collectors.toList());

    }

    public List<Character> getBoardToVictoryCondition() {
        return this.boardToVictoryCondition;
    }

    public char getField(int i) {
        return this.boardToVictoryCondition.get(i);
    }

    public boolean checkField(int i) {

        if (i > 0 || i < 10) {
            return this.boardToVictoryCondition.get(i) == 'o' || this.boardToVictoryCondition.get(i) == 'x';
        } else {
            throw new IndexOutOfBoundsException("Give a correct number 1-9");
        }
    }

    public void setBoardToVictoryCondition(int toReplace, char sign) {
        this.boardToVictoryCondition.set(toReplace, sign);
    }

    public boolean checkWinner() {
        int row = 0;
        int col = 0;
/*
        if ((this.boardToVictoryCondition.get(0) == this.boardToVictoryCondition.get(4) && this.boardToVictoryCondition.get(4) == this.boardToVictoryCondition.get(8))) {
            this.isWinner = true;
        } else if (this.boardToVictoryCondition.get(2) == this.boardToVictoryCondition.get(4) && this.boardToVictoryCondition.get(4) == this.boardToVictoryCondition.get(6)) {
            this.isWinner = true;
        } else {

            while (row < 7) {
                if (this.boardToVictoryCondition.get(0 + row) == this.boardToVictoryCondition.get(1 + row) && this.boardToVictoryCondition.get(1 + row) == this.boardToVictoryCondition.get(2 + row)) {
                    this.isWinner = true;
                }
                row = row + 3;
            }
            while (col < 3) {
                if (this.boardToVictoryCondition.get(0 + col) == this.boardToVictoryCondition.get(3 + col) && this.boardToVictoryCondition.get(3 + col) == this.boardToVictoryCondition.get(6 + col)) {
                    this.isWinner = true;
                }
                col = col + 1;
            }
        }*/
        return this.isWinner;
    }


}
