package com.github.agatagolonka.OX;

public class OXBoard {

    private String board = """
              1|2|3 
              4|5|6
              7|8|9
            """;

    public String getBoard() {
        return board;
    }

    public void setBoard(char toReplace, char sign) {

        this.board = this.board.replace(toReplace, sign);

    }
}
