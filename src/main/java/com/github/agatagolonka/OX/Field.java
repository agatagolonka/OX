package com.github.agatagolonka.OX;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Field {
    char field;

    protected Field() {
    }
    protected void fieldUser(){
        try{
            field= new Scanner(System.in).next().charAt(0);
        }
        catch (InputMismatchException ex){
            System.out.println("Podaj prawidłową nazwę pola - cyfrę od 1-9");
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("Podaj prawidłową nazwę pola - cyfrę od 1-9");
        }
    }
    protected char userField(){
        return  field;
    }
}
