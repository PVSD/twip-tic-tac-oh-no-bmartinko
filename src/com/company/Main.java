package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        boolean end = false;
        char board[] = {' ',' ',' ',' ',' ',' ',' ',' ',' '};
        String playerLetter;
        String computerLetter;

        System.out.println("Welcome to Tic-Tac-Toe with the computer!");
        for(int i = 0; i < 3; i++){
            System.out.println("____ | ____ | ____ ");
        }
        Scanner playerA = new Scanner(System.in);


        while (end = false){
            int d = (int)(Math.random()) * 100;

            if(d >50){
            computerLetter = "X";
            playerLetter = "O";
            }else{
            computerLetter = "X";
            playerLetter = "O";
            }


        }
    }
}
