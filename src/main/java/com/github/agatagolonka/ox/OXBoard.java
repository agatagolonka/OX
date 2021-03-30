package com.github.agatagolonka.ox;

class OXBoard {

    private String board;

    OXBoard(int size) {
        if (size == 3) {
            this.board = """
                       1| 2| 3 
                       4| 5| 6
                       7| 8| 9
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

    String getBoard() {
        return board;
    }

    void setBoard(Integer toReplace, Character sign) {
        if(toReplace>9) {
            this.board = this.board.replace(toReplace.toString(), " "+sign.toString());
        }
        else if(toReplace==1||toReplace==2){
            this.board = this.board.replace(" "+toReplace.toString()+"|", " "+sign.toString()+"|");
        }
        else{
            this.board = this.board.replace(" "+toReplace.toString(), " "+sign.toString());

        }
    }
}
