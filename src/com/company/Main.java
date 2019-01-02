package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        boolean end = false;
        boolean endB = false;
        String bank[] = {"0","1","2","3","4","5","6","7","8"};
        int turn = 1;


        System.out.println("Welcome to Tic-Tac-Toe with the computer!");

        System.out.println("This is the blank board:");
        System.out.println("\n " + bank[0] + " | " + bank[1] + " | " + bank[2] + " \n " + bank[3] + " | " + bank[4] +
                " | " + bank[5] +  "\n " + bank[6] + " | " + bank[7] + " | " + bank[8]);

        System.out.println("Hello! Would you like to go first (You are X)? If so, press 1. If you want the computer to go first" +
                "(You are O), hit anything else");
        Scanner a = new Scanner(System.in);
        String d = a.nextLine();
        if (d.equals("1")){
            while(end == false && endB == false) {

                if (bank[0].equalsIgnoreCase("x") && bank[1].equalsIgnoreCase("x") && bank[2].equalsIgnoreCase("x")
                || bank[3].equalsIgnoreCase("x") && bank[4].equalsIgnoreCase("x") && bank[5].equalsIgnoreCase("x")
                || bank[6].equalsIgnoreCase("x") && bank[7].equalsIgnoreCase("x") && bank[8].equalsIgnoreCase("x")
                || bank[0].equalsIgnoreCase("x") && bank[3].equalsIgnoreCase("x") && bank[6].equalsIgnoreCase("x")
                || bank[1].equalsIgnoreCase("x") && bank[4].equalsIgnoreCase("x") && bank[7].equalsIgnoreCase("x")
                || bank[2].equalsIgnoreCase("x") && bank[5].equalsIgnoreCase("x") && bank[8].equalsIgnoreCase("x")
                || bank[0].equalsIgnoreCase("x") && bank[4].equalsIgnoreCase("x") && bank[8].equalsIgnoreCase("x")
                || bank[6].equalsIgnoreCase("x") && bank[4].equalsIgnoreCase("x") && bank[2].equalsIgnoreCase("x")) {
                    end = true;
                    System.out.println("Congrats! X won!");
                } else if ((bank[0].equalsIgnoreCase("o") && bank[1].equalsIgnoreCase("o") && bank[2].equalsIgnoreCase("o")
                        || bank[3].equalsIgnoreCase("o") && bank[4].equalsIgnoreCase("o") && bank[5].equalsIgnoreCase("o")
                        || bank[6].equalsIgnoreCase("o") && bank[7].equalsIgnoreCase("o") && bank[8].equalsIgnoreCase("o")
                        || bank[0].equalsIgnoreCase("o") && bank[3].equalsIgnoreCase("o") && bank[6].equalsIgnoreCase("o")
                        || bank[1].equalsIgnoreCase("o") && bank[4].equalsIgnoreCase("o") && bank[7].equalsIgnoreCase("o")
                        || bank[2].equalsIgnoreCase("o") && bank[5].equalsIgnoreCase("o") && bank[8].equalsIgnoreCase("o")
                        || bank[0].equalsIgnoreCase("o") && bank[4].equalsIgnoreCase("o") && bank[8].equalsIgnoreCase("o")
                        || bank[6].equalsIgnoreCase("o") && bank[4].equalsIgnoreCase("o") && bank[2].equalsIgnoreCase("o"))) {
                    endB = true;
                    System.out.println("Congrats! O won!");

                }else{
                    System.out.println("Where would you like to place the X? Please enter a number 0-8");
                    Scanner playerX = new Scanner(System.in);
                    int selection = playerX.nextInt();
                    if (selection > 8 || selection < 0) {
                        System.out.println("Please enter a valid number");
                    }
                    if (bank[selection].equalsIgnoreCase("x") || bank[selection].equalsIgnoreCase("o")) {
                        System.out.println("Please enter a space that has not been entered");
                    } else {
                        bank[selection] = "X";
                    }
                    System.out.println("\n " + bank[0] + " | " + bank[1] + " | " + bank[2] + " \n " + bank[3] + " | " + bank[4] +
                            " | " + bank[5] + "\n " + bank[6] + " | " + bank[7] + " | " + bank[8]);
                    turn+= 1;
                    if (turn > 10){
                        System.out.println("This is a draw!");
                    }

                }
            }
        }else {
            while(end == false && endB == false) {

                if (bank[0].equalsIgnoreCase("x") && bank[1].equalsIgnoreCase("x") && bank[2].equalsIgnoreCase("x")
                        || bank[3].equalsIgnoreCase("x") && bank[4].equalsIgnoreCase("x") && bank[5].equalsIgnoreCase("x")
                        || bank[6].equalsIgnoreCase("x") && bank[7].equalsIgnoreCase("x") && bank[8].equalsIgnoreCase("x")
                        || bank[0].equalsIgnoreCase("x") && bank[3].equalsIgnoreCase("x") && bank[6].equalsIgnoreCase("x")
                        || bank[1].equalsIgnoreCase("x") && bank[4].equalsIgnoreCase("x") && bank[7].equalsIgnoreCase("x")
                        || bank[2].equalsIgnoreCase("x") && bank[5].equalsIgnoreCase("x") && bank[8].equalsIgnoreCase("x")
                        || bank[0].equalsIgnoreCase("x") && bank[4].equalsIgnoreCase("x") && bank[8].equalsIgnoreCase("x")
                        || bank[6].equalsIgnoreCase("x") && bank[4].equalsIgnoreCase("x") && bank[2].equalsIgnoreCase("x")) {
                    end = true;
                    System.out.println("Congrats! X won!");
                } else if ((bank[0].equalsIgnoreCase("o") && bank[1].equalsIgnoreCase("o") && bank[2].equalsIgnoreCase("o")
                        || bank[3].equalsIgnoreCase("o") && bank[4].equalsIgnoreCase("o") && bank[5].equalsIgnoreCase("o")
                        || bank[6].equalsIgnoreCase("o") && bank[7].equalsIgnoreCase("o") && bank[8].equalsIgnoreCase("o")
                        || bank[0].equalsIgnoreCase("o") && bank[3].equalsIgnoreCase("o") && bank[6].equalsIgnoreCase("o")
                        || bank[1].equalsIgnoreCase("o") && bank[4].equalsIgnoreCase("o") && bank[7].equalsIgnoreCase("o")
                        || bank[2].equalsIgnoreCase("o") && bank[5].equalsIgnoreCase("o") && bank[8].equalsIgnoreCase("o")
                        || bank[0].equalsIgnoreCase("o") && bank[4].equalsIgnoreCase("o") && bank[8].equalsIgnoreCase("o")
                        || bank[6].equalsIgnoreCase("o") && bank[4].equalsIgnoreCase("o") && bank[2].equalsIgnoreCase("o"))) {
                    endB = true;
                    System.out.println("Congrats! O won!");

                }else{
                    System.out.println("Where would you like to place the X? Please enter a number 0-8");
                    Scanner playerX = new Scanner(System.in);
                    int selection = playerX.nextInt();
                    if (selection > 8 || selection < 0) {
                        System.out.println("Please enter a valid number");
                    }
                    if (bank[selection].equalsIgnoreCase("x") || bank[selection].equalsIgnoreCase("o")) {
                        System.out.println("Please enter a space that has not been entered");
                    } else {
                        bank[selection] = "O";
                    }
                    System.out.println("\n " + bank[0] + " | " + bank[1] + " | " + bank[2] + " \n " + bank[3] + " | " + bank[4] +
                            " | " + bank[5] + "\n " + bank[6] + " | " + bank[7] + " | " + bank[8]);
                    turn+= 1;
                    if (turn > 10){
                        System.out.println("This is a draw!");
                    }

                }
            }      }


     }
    }

