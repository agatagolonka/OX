package com.github.agatagolonka.ox;

class PlayOX {
    private final CommunicationWithUser messagesToUser;
    private final OXBoard displayedBoard;
    private final OXVictoryCondition checkWinBoard;
    private final VictoryLists victory;
    private final OXMove player;

    PlayOX() {
        this.messagesToUser = new CommunicationWithUser();
        messagesToUser.giveMessage("Welcome to my tic tac toe game");
        int size = messagesToUser.chooseSizeBoard();
        this.displayedBoard = new OXBoard(size);
        this.checkWinBoard = new OXVictoryCondition(size);
        this.victory=new VictoryLists(size);
        char[] signs = messagesToUser.chooseSigns();
        this.player = new OXMove(signs);
    }


    void play() {

        while (!checkWinBoard.checkWinner(victory, player.getSign())) {
            if (checkWinBoard.checkOccupiedAllFields()) {
                break;
            }
            messagesToUser.showBoard(displayedBoard);
            player.changePlayer();
            messagesToUser.giveMessage("Player " + player.getSign() + "Give a number of field");
            int fieldName = messagesToUser.takeFieldName();

            if (checkWinBoard.checkField(fieldName)) {
                messagesToUser.giveMessage("This field is occupied, Give me nr of field to add " + player.getSign());
            } else {
                displayedBoard.setBoard(fieldName, player.getSign());
                checkWinBoard.setBoardToVictoryCondition(fieldName, player.getSign());
            }
        }

        if (checkWinBoard.checkWinner(victory, player.getSign()))
            messagesToUser.giveMessage("Winner is player with sign " + player.getSign());
        else
            messagesToUser.giveMessage("Sorry, all fields are occupied, Remis " + player.getSign());

    }

}
