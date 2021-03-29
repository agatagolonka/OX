package com.github.agatagolonka.ox;

public class PlayOX {
    private final CommunicationWithUser messagesToUser;
    private final OXBoard displayedBoard;
    private final OXVictoryCondition checkWinBoard;
    private final OXMove player;

    public PlayOX() {
        this.messagesToUser = new CommunicationWithUser();
        messagesToUser.giveMessage("Welcome to my tic tac toe game");
        int size = messagesToUser.chooseSizeBoard();
        this.displayedBoard = new OXBoard(size);
        this.checkWinBoard = new OXVictoryCondition(size);
        char[] signs = messagesToUser.chooseSigns();
        this.player = new OXMove(signs);
    }


    public void play() {

        while (!checkWinBoard.checkWinner()) {

            messagesToUser.showBoard(displayedBoard);
            player.changePlayer();
            messagesToUser.giveMessage("Player " + player.getSign() + "Give a number of field");

            int fieldName= messagesToUser.takeFieldName();
            displayedBoard.setBoard(fieldName, player.getSign());
            checkWinBoard.setBoardToVictoryCondition(fieldName, player.getSign());
               /*   if (checkWinBoard.checkField(Character.getNumericValue(field.userField()) - 1)) {

                    System.out.println("This field is occupied, Give me nr of field to add " + player.getSign());
                }*/
        }
         /*    checkWinBoard.setBoardToVictoryCondition(Character.getNumericValue(field.userField()) - 1, player.getSign());

        System.out.println("Winner is player with sign "+player.getSign());*/
    }

}
