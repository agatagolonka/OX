package com.github.agatagolonka.ox;

public interface UserInterface {
    void giveMessage(String msg);

    void showBoard(OXBoard displayedBoard);

    int takeFieldName();

    int chooseSizeBoard();

    char[] chooseSigns();

}
