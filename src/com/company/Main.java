package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        boolean end = false;
        boolean endB = false;
        String bank[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
        int magic[] = {4, 9, 2, 3, 5, 7, 8, 1, 6};
        boolean flip[] = {false, false};
        int turn = 1;
        int botPick;


        System.out.println("Welcome to Tic-Tac-Toe with the computer!");

        System.out.println("This is the blank board:");
        System.out.println("\n " + bank[0] + " | " + bank[1] + " | " + bank[2] + " \n " + bank[3] + " | " + bank[4] +
                " | " + bank[5] + "\n " + bank[6] + " | " + bank[7] + " | " + bank[8]);

        System.out.println("Hello! Would you like to go first (You are X) against a computer? If so, press 1.");
        System.out.println("If you want the computer to go first (You are O), hit 2.");
        System.out.println("If you would like to play against someone else with x going first, hit 3");
        System.out.println("If you would like to play against someone else with o going first, hit 4");
        Scanner a = new Scanner(System.in);
        String d = a.nextLine();
        if (d.equals("1")) {
            while (flip[0]== false && flip[1] == false) {
                board check = new board(bank, magic, flip);
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
                check.xWin();
                if(flip[0]== false && flip[1] == false) {
                    System.out.println(check.gameOneBot());
                    bank[check.gameOneBot()] = "O";
                    System.out.println("\n " + bank[0] + " | " + bank[1] + " | " + bank[2] + " \n " + bank[3] + " | " + bank[4] +
                            " | " + bank[5] + "\n " + bank[6] + " | " + bank[7] + " | " + bank[8]);
                    check.oWin();
                }



                    if (turn > 10) {
                        System.out.println("This is a draw!");
                    }


            }
        } else if (d.equals("2")) {
            while (flip[0]== false && flip[1] == false) {
                board check = new board(bank, magic, flip);
                bank[check.gameOneBot()] = "O";
                System.out.println("\n " + bank[0] + " | " + bank[1] + " | " + bank[2] + " \n " + bank[3] + " | " + bank[4] +
                        " | " + bank[5] + "\n " + bank[6] + " | " + bank[7] + " | " + bank[8]);
                check.oWin();
                if (flip[0] == false && flip[1] == false) {
                System.out.println("Where would you like to place the O? Please enter a number 0-8");
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
                check.oWin();
                turn += 1; }
                if (turn > 10) {
                    System.out.println("This is a draw!");
                }

                }

        } else if (d.equals("3")) {
            while (flip[0]== false && flip[1] == false) {
                board check = new board(bank, magic, flip);
                System.out.println("Where would you like to place the X? Please enter a number 0-8");
                Scanner playerX = new Scanner(System.in);
                int selection = playerX.nextInt();
                if (selection > 8 || selection < 0) {
                    System.out.println("Please enter a valid number");
                    selection = playerX.nextInt();
                    bank[selection] = "X";
                }
                if (bank[selection].equalsIgnoreCase("x") || bank[selection].equalsIgnoreCase("o")) {
                    System.out.println("Please enter a space that has not been entered");
                    selection = playerX.nextInt();
                    bank[selection] = "X";
                } else {
                    bank[selection] = "X";
                }
                System.out.println("\n " + bank[0] + " | " + bank[1] + " | " + bank[2] + " \n " + bank[3] + " | " + bank[4] +
                        " | " + bank[5] + "\n " + bank[6] + " | " + bank[7] + " | " + bank[8]);
                check.xWin();
                turn += 1;
                if (flip[0] == false && flip[1] == false) {
                    System.out.println("Now it's O's turn! Select where you would like to place the O from 0-8");
                    selection = playerX.nextInt();
                    if (selection > 8 || selection < 0) {
                        System.out.println("Please enter a valid number");
                        selection = playerX.nextInt();
                        bank[selection] = "O";
                    }
                    if (bank[selection].equalsIgnoreCase("x") || bank[selection].equalsIgnoreCase("o")) {
                        System.out.println("Please enter a space that has not been entered");
                        selection = playerX.nextInt();
                        bank[selection] = "O";
                    } else {
                        bank[selection] = "O";
                    }
                    System.out.println("\n " + bank[0] + " | " + bank[1] + " | " + bank[2] + " \n " + bank[3] + " | " + bank[4] +
                            " | " + bank[5] + "\n " + bank[6] + " | " + bank[7] + " | " + bank[8]);
                    check.oWin();
                    turn += 1;
                    if (turn > 10) {
                        System.out.println("This is a draw!");
                    }
                }
            }



        }else if (d.equals("4")){
            while(flip[0]== false && flip[1] == false) {

                board check = new board(bank, magic, flip);
                System.out.println("Where would you like to place the O? Please enter a number 0-8");
                Scanner playerX = new Scanner(System.in);
                int selection = playerX.nextInt();
                if (selection > 8 || selection < 0) {
                    System.out.println("Please enter a valid number");
                    selection = playerX.nextInt();
                    bank[selection] = "O";
                }
                if (bank[selection].equalsIgnoreCase("x") || bank[selection].equalsIgnoreCase("o")) {
                    System.out.println("Please enter a space that has not been entered");
                    selection = playerX.nextInt();
                    bank[selection] = "O";
                } else {
                    bank[selection] = "O";
                }
                System.out.println("\n " + bank[0] + " | " + bank[1] + " | " + bank[2] + " \n " + bank[3] + " | " + bank[4] +
                        " | " + bank[5] + "\n " + bank[6] + " | " + bank[7] + " | " + bank[8]);
                check.oWin();
                turn += 1;
                if (flip[0] == false && flip[1] == false) {
                    System.out.println("Now it's X's turn! Select where you would like to place the O from 0-8");
                    selection = playerX.nextInt();
                    if (selection > 8 || selection < 0) {
                        System.out.println("Please enter a valid number");
                        selection = playerX.nextInt();
                        bank[selection] = "X";
                    }
                    if (bank[selection].equalsIgnoreCase("x") || bank[selection].equalsIgnoreCase("o")) {
                        System.out.println("Please enter a space that has not been entered");
                        selection = playerX.nextInt();
                        bank[selection] = "X";
                    } else {
                        bank[selection] = "X";
                    }
                    System.out.println("\n " + bank[0] + " | " + bank[1] + " | " + bank[2] + " \n " + bank[3] + " | " + bank[4] +
                            " | " + bank[5] + "\n " + bank[6] + " | " + bank[7] + " | " + bank[8]);
                    turn += 1;
                    check.xWin();
                    if (turn > 10) {
                        System.out.println("This is a draw!");
                    }
                }
            }

        }else{
            System.out.println("Please hit one of the desired keys");
        }


     }
    }

