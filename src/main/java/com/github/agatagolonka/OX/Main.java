package com.github.agatagolonka.OX;

public class Main {


    public static void main(String[] args) {

        OXBoard displayedBoard = new OXBoard();
        OXVictoryCondition checkWinBoard = new OXVictoryCondition();
        char sign = 'x';
        OXMove player = new OXMove(sign);
        Field field= new Field();


        System.out.println("Welcome to my tic tac toe game");

        while (!checkWinBoard.checkWinner()) {
            System.out.println(displayedBoard.getBoard());
            player.changePlayer();
            System.out.println("Give me nr of field to add " + player.getSign());

            do {
                    field.fieldUser();
                 if (checkWinBoard.checkField(Character.getNumericValue(field.userField()) - 1)) {

                    System.out.println("This field is occupied, Give me nr of field to add " + player.getSign());
                }
            } while (checkWinBoard.checkField(Character.getNumericValue(field.userField()) - 1));

            displayedBoard.setBoard(field.userField(), player.getSign());
            checkWinBoard.setBoardToVictoryCondition(Character.getNumericValue(field.userField()) - 1, player.getSign());
        }
        System.out.println("Winner is player with sign "+player.getSign());
    }

}
