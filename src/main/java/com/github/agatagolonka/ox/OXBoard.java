package com.github.agatagolonka.ox;

class OXBoard {

    private String board;

    public OXBoard(int size) {
        if (size == 3) {
            this.board = """
                      1|2|3 
                      4|5|6
                      7|8|9
                    """;
        } else if (size == 5) {
            this.board = """
                       1| 2| 3| 4| 5
                       6| 7| 8| 9|10
                      11|12|13|14|15
                      16|17|18|19|20
                      21|22|23|24|25
                    """;
        }

    }

    public String getBoard() {
        return board;
    }

    public void setBoard(Integer toReplace, Character sign) {

        this.board = this.board.replace(toReplace.toString(), sign.toString());

    }
}
