package com.github.agatagolonka.ox;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class OXVictoryCondition {

    private final int size;
    List<Character> boardToVictoryCondition;
    boolean isWinner = false;

    public OXVictoryCondition(int size) {
        this.size = size;
        this.boardToVictoryCondition = IntStream.rangeClosed(1, size * size + 1).boxed()
                .map(i -> Character.forDigit(i, size * size + 1))
                .collect(Collectors.toList());

    }

    boolean checkField(int i) {

        if (i > 0 && i < size*size+1) {
            return this.boardToVictoryCondition.get(i) == 'O' || this.boardToVictoryCondition.get(i) == 'X'||this.boardToVictoryCondition.get(i) == '+'||this.boardToVictoryCondition.get(i) == '-';
        } else {
            throw new IndexOutOfBoundsException("Give a correct number");
        }
    }

    public void setBoardToVictoryCondition(int toReplace, char sign) {
        this.boardToVictoryCondition.set(toReplace, sign);
    }

    public boolean checkWinner(VictoryLists victory) {

        List<Integer> checkX = IntStream.rangeClosed(1, size * size - 1).boxed()
                .map(n -> new PairNumber(n, boardToVictoryCondition.get(n)))
                .filter(n -> n.getValue() == 'X')
                .map(n -> n.getKey())
                .collect(Collectors.toList());

        List<Integer> checkO = IntStream.rangeClosed(1, size * size - 1).boxed()
                .map(n -> new PairNumber(n, boardToVictoryCondition.get(n)))
                .filter(n -> n.getValue() == 'O')
                .map(n -> n.getKey())
                .collect(Collectors.toList());

        List<Integer> checkMinus = IntStream.rangeClosed(1, size * size - 1).boxed()
                .map(n -> new PairNumber(n, boardToVictoryCondition.get(n)))
                .filter(n -> n.getValue() == '-')
                .map(n -> n.getKey())
                .collect(Collectors.toList());

        List<Integer> checkPlus = IntStream.rangeClosed(1, size * size - 1).boxed()
                .map(n -> new PairNumber(n, boardToVictoryCondition.get(n)))
                .filter(n -> n.getValue() == '+')
                .map(n -> n.getKey())
                .collect(Collectors.toList());

        this.isWinner = victory.containsAll(checkX);
        if (this.isWinner)
            return this.isWinner;
        this.isWinner = victory.containsAll(checkO);
        if (this.isWinner)
            return this.isWinner;
        this.isWinner = victory.containsAll(checkMinus);
        if (this.isWinner)
            return this.isWinner;
        this.isWinner = victory.containsAll(checkPlus);

        return this.isWinner;
    }


    public boolean checkOccupiedAllFields() {
        List<Character> tmp = boardToVictoryCondition.stream()
                .filter(n -> n != 'O' && n != 'X'&&n!='-'&&n!='+')
                .collect(Collectors.toList());
        if (tmp.size()<2)
            return true;
        return false;

    }


}
