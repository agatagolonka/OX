package com.github.agatagolonka.ox;

import java.util.InputMismatchException;
import java.util.Scanner;

class Field {
    String field;

    protected Field() {
    }
    protected void fieldUser(){
        try{
            field= new Scanner(System.in).next();
        }
        catch (InputMismatchException ex){
            System.out.println("Podaj prawidłową nazwę pola");
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("Podaj prawidłową nazwę pola");
        }
    }
    protected String userField(){
        return  field;
    }
}
