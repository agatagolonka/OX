package com.github.agatagolonka.ox;

import java.util.InputMismatchException;
import java.util.Scanner;

class CommunicationWithUser implements UserInterface {
    public CommunicationWithUser() {
    }

    @Override
    public void giveMessage(String msg) {
        System.out.println(msg);
    }

    @Override
    public void showBoard(OXBoard displayedBoard) {
        System.out.println(displayedBoard.getBoard());

    }

    @Override
    public int takeFieldName() {
        Scanner skaner = new Scanner(System.in);
        int field = 0;
        boolean validNumber = false;
        while (!validNumber) {

            try {
                field = Integer.parseInt(skaner.next());
                if (field > 0) {
                    return field;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Give valid field number");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Give valid field number");
            }

        }
        return field;
    }

    @Override
    public int chooseSizeBoard() {
        Scanner skaner = new Scanner(System.in);
        int size = 0;
        System.out.println("Choose size of board. Click 3 for 3x3 or 5 for 5x5");
        boolean validNumber = false;
        while (!validNumber) {

            try {
                size = skaner.next().charAt(0) - 48;
                if (size == 3 || size == 5) {
                    return size;
                } else {
                    System.out.println("Give valid size");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Give valid size");
            }
        }
        return size;
    }

    @Override
    public char[] chooseSigns() {
        Scanner skaner = new Scanner(System.in);
        int chooseSigns = 0;
        System.out.println("Choose signs:" +
                "Click 1 for signs 'O' and 'X'\n" +
                "Click 2 for signs'+' and '-'");
        boolean validNumber = false;
        char[] signs = null;
        while (!validNumber) {
            try {
                chooseSigns = skaner.next().charAt(0) - 48;
                if (chooseSigns == 1) {
                    signs = new char[]{'O', 'X'};
                    return signs;
                } else if (chooseSigns == 2) {
                    signs = new char[]{'-', '+'};
                    return signs;
                } else {
                    System.out.println("Give valid field signs");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Give valid field signs");
            }

        }

        return signs;
    }
}
