package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        boolean end = false;
        String board[][] = new String[3][3];
        boolean victory = false;

        while(victory == false){
        System.out.println("Welcome to Tic-Tac-Toe with the computer!");
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < 2; i++){
            for(int z = 0; z < 2; z++){
                    sb.append("____|");

            }
            sb.append("____\n");
        }
        for(int x = 0; x < 2; x++){
            sb.append("    |");
        }

        String s = sb.toString();
        System.out.println(s);

        Scanner playerA = new Scanner(System.in);
        System.out.println("Enter the row you would like to place your x in");
        int choiceA = playerA.nextInt();
        if (choiceA > 2 || choiceA < 0) {
            System.out.println("Please input a number in the correct range (0-2)");
        }
        System.out.println("Enter the column you would like to place the x in");
        int choiceB = playerA.nextInt();
        if (choiceB > 2 || choiceB < 0) {
            System.out.println("Please input a number in the correct range (0-2)");
        }

     }
    if (victory == true){
        System.out.println("A draw has been found");
        System.out.println("The Computer has won the game!");
        System.out.println("You have won the game!");
    }
    }
}
