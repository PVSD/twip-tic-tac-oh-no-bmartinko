package com.company;

public class board {

    public String[] gameBoard;
    public boolean[] possibleWin;
    int[] squareCheck;
    int check = 0;
    int maxValue = 0;
    public int i = (int)Math.floor((Math.random()*5));
    public int p = i % 4;
    public board(String[] a, int[] b , boolean[] c ){
        gameBoard = a;
        squareCheck = b;
        possibleWin = c;
    }

    public boolean xWin() {
        if (gameBoard[0].equalsIgnoreCase("x") && gameBoard[1].equalsIgnoreCase("x") && gameBoard[2].equalsIgnoreCase("x")
                || gameBoard[3].equalsIgnoreCase("x") && gameBoard[4].equalsIgnoreCase("x") && gameBoard[5].equalsIgnoreCase("x")
                || gameBoard[6].equalsIgnoreCase("x") && gameBoard[7].equalsIgnoreCase("x") && gameBoard[8].equalsIgnoreCase("x")
                || gameBoard[0].equalsIgnoreCase("x") && gameBoard[3].equalsIgnoreCase("x") && gameBoard[6].equalsIgnoreCase("x")
                || gameBoard[1].equalsIgnoreCase("x") && gameBoard[4].equalsIgnoreCase("x") && gameBoard[7].equalsIgnoreCase("x")
                || gameBoard[2].equalsIgnoreCase("x") && gameBoard[5].equalsIgnoreCase("x") && gameBoard[8].equalsIgnoreCase("x")
                || gameBoard[0].equalsIgnoreCase("x") && gameBoard[4].equalsIgnoreCase("x") && gameBoard[8].equalsIgnoreCase("x")
                || gameBoard[6].equalsIgnoreCase("x") && gameBoard[4].equalsIgnoreCase("x") && gameBoard[2].equalsIgnoreCase("x")) {
            possibleWin[0] = true;
            return possibleWin[0];
        } else
            possibleWin[0] = false;
            return possibleWin[0];
    }


        public boolean oWin(){
        if (gameBoard[0].equalsIgnoreCase("o") && gameBoard[1].equalsIgnoreCase("o") && gameBoard[2].equalsIgnoreCase("o")
                || gameBoard[3].equalsIgnoreCase("o") && gameBoard[4].equalsIgnoreCase("o") && gameBoard[5].equalsIgnoreCase("o")
                || gameBoard[6].equalsIgnoreCase("o") && gameBoard[7].equalsIgnoreCase("o") && gameBoard[8].equalsIgnoreCase("o")
                || gameBoard[0].equalsIgnoreCase("o") && gameBoard[3].equalsIgnoreCase("o") && gameBoard[6].equalsIgnoreCase("o")
                || gameBoard[1].equalsIgnoreCase("o") && gameBoard[4].equalsIgnoreCase("o") && gameBoard[7].equalsIgnoreCase("o")
                || gameBoard[2].equalsIgnoreCase("o") && gameBoard[5].equalsIgnoreCase("o") && gameBoard[8].equalsIgnoreCase("o")
                || gameBoard[0].equalsIgnoreCase("o") && gameBoard[4].equalsIgnoreCase("o") && gameBoard[8].equalsIgnoreCase("o")
                || gameBoard[6].equalsIgnoreCase("o") && gameBoard[4].equalsIgnoreCase("o") && gameBoard[2].equalsIgnoreCase("o")){
            possibleWin[1] = true;
            return possibleWin[1];
        }else
            possibleWin[1] = false;
            return possibleWin[1];
    }
    public int gameOneBot() {
        if (gameBoard[0].equalsIgnoreCase("x") && gameBoard[1].equalsIgnoreCase("x")) {
            return 2;
        } else if (gameBoard[1].equalsIgnoreCase("x") && gameBoard[2].equalsIgnoreCase("x")) {
            return 0;
        } else if (gameBoard[0].equalsIgnoreCase("x") && gameBoard[2].equalsIgnoreCase("x")) {
            return 1;
        } else if (gameBoard[3].equalsIgnoreCase("x") && gameBoard[4].equalsIgnoreCase("x")) {
            return 5;
        } else if (gameBoard[3].equalsIgnoreCase("x") && gameBoard[5].equalsIgnoreCase("x")) {
            return 4;
        } else if (gameBoard[4].equalsIgnoreCase("x") && gameBoard[5].equalsIgnoreCase("x")) {
            return 3;
        } else if (gameBoard[6].equalsIgnoreCase("x") && gameBoard[7].equalsIgnoreCase("x")) {
            return 8;
        } else if (gameBoard[6].equalsIgnoreCase("x") && gameBoard[8].equalsIgnoreCase("x")) {
            return 7;
        } else if (gameBoard[7].equalsIgnoreCase("x") && gameBoard[8].equalsIgnoreCase("x")) {
            return 6;
        } else if ((gameBoard[0].equalsIgnoreCase("x") && gameBoard[3].equalsIgnoreCase("x"))) {
            return 6;
        } else if (gameBoard[0].equalsIgnoreCase("x") && gameBoard[6].equalsIgnoreCase("x")) {
            return 3;
        } else if (gameBoard[3].equalsIgnoreCase("x") && gameBoard[6].equalsIgnoreCase("x")) {
            return 0;
        } else if (gameBoard[1].equalsIgnoreCase("x") && gameBoard[4].equalsIgnoreCase("x")) {
            return 7;
        } else if (gameBoard[1].equalsIgnoreCase("x") && gameBoard[7].equalsIgnoreCase("x")) {
            return 4;
        } else if (gameBoard[4].equalsIgnoreCase("x") && gameBoard[7].equalsIgnoreCase("x")) {
            return 1;
        } else if (gameBoard[2].equalsIgnoreCase("x") && gameBoard[5].equalsIgnoreCase("x")) {
            return 8;
        } else if (gameBoard[2].equalsIgnoreCase("x") && gameBoard[8].equalsIgnoreCase("x")) {
            return 5;
        } else if (gameBoard[5].equalsIgnoreCase("x") && gameBoard[8].equalsIgnoreCase("x")) {
            return 2;
        } else if (gameBoard[0].equalsIgnoreCase("x") && gameBoard[4].equalsIgnoreCase("x")) {
            return 8;
        } else if (gameBoard[0].equalsIgnoreCase("x") && gameBoard[8].equalsIgnoreCase("x")) {
            return 4;
        } else if (gameBoard[4].equalsIgnoreCase("x") && gameBoard[8].equalsIgnoreCase("x")) {
            return 0;
        } else if (gameBoard[2].equalsIgnoreCase("x") && gameBoard[4].equalsIgnoreCase("x")) {
            return 6;
        } else if (gameBoard[2].equalsIgnoreCase("x") && gameBoard[6].equalsIgnoreCase("x")) {
            return 4;
        } else if (gameBoard[4].equalsIgnoreCase("x") && gameBoard[6].equalsIgnoreCase("x")) {
            return 2;
        } else if (gameBoard[0].equalsIgnoreCase("o") && gameBoard[1].equalsIgnoreCase("o")) {
            return 2;
        } else if (gameBoard[1].equalsIgnoreCase("o") && gameBoard[2].equalsIgnoreCase("o")) {
            return 0;
        } else if (gameBoard[0].equalsIgnoreCase("o") && gameBoard[2].equalsIgnoreCase("o")) {
            return 1;
        } else if (gameBoard[3].equalsIgnoreCase("o") && gameBoard[4].equalsIgnoreCase("o")) {
            return 5;
        } else if (gameBoard[3].equalsIgnoreCase("o") && gameBoard[5].equalsIgnoreCase("o")) {
            return 4;
        } else if (gameBoard[4].equalsIgnoreCase("o") && gameBoard[5].equalsIgnoreCase("o")) {
            return 3;
        } else if (gameBoard[6].equalsIgnoreCase("o") && gameBoard[7].equalsIgnoreCase("o")) {
            return 8;
        } else if (gameBoard[6].equalsIgnoreCase("o") && gameBoard[8].equalsIgnoreCase("o")) {
            return 7;
        } else if (gameBoard[7].equalsIgnoreCase("o") && gameBoard[8].equalsIgnoreCase("o")) {
            return 6;
        } else if ((gameBoard[0].equalsIgnoreCase("o") && gameBoard[3].equalsIgnoreCase("o"))) {
            return 6;
        } else if (gameBoard[0].equalsIgnoreCase("o") && gameBoard[6].equalsIgnoreCase("o")) {
            return 3;
        } else if (gameBoard[3].equalsIgnoreCase("o") && gameBoard[6].equalsIgnoreCase("o")) {
            return 0;
        } else if (gameBoard[1].equalsIgnoreCase("o") && gameBoard[4].equalsIgnoreCase("o")) {
            return 7;
        } else if (gameBoard[1].equalsIgnoreCase("o") && gameBoard[7].equalsIgnoreCase("o")) {
            return 4;
        } else if (gameBoard[4].equalsIgnoreCase("o") && gameBoard[7].equalsIgnoreCase("o")) {
            return 1;
        } else if (gameBoard[2].equalsIgnoreCase("o") && gameBoard[5].equalsIgnoreCase("o")) {
            return 8;
        } else if (gameBoard[2].equalsIgnoreCase("o") && gameBoard[8].equalsIgnoreCase("o")) {
            return 5;
        } else if (gameBoard[5].equalsIgnoreCase("o") && gameBoard[8].equalsIgnoreCase("o")) {
            return 2;
        } else if (gameBoard[0].equalsIgnoreCase("o") && gameBoard[4].equalsIgnoreCase("o")) {
            return 8;
        } else if (gameBoard[0].equalsIgnoreCase("o") && gameBoard[8].equalsIgnoreCase("o")) {
            return 4;
        } else if (gameBoard[4].equalsIgnoreCase("o") && gameBoard[8].equalsIgnoreCase("o")) {
            return 0;
        } else if (gameBoard[2].equalsIgnoreCase("o") && gameBoard[4].equalsIgnoreCase("o")) {
            return 6;
        } else if (gameBoard[2].equalsIgnoreCase("o") && gameBoard[6].equalsIgnoreCase("o")) {
            return 4;
        } else if (gameBoard[4].equalsIgnoreCase("o") && gameBoard[6].equalsIgnoreCase("o")) {
            return 2;
        } else if (gameBoard[4].equals("x") && p == 0 && gameBoard[0] != "O") {
            return 0;
        } else if (gameBoard[4].equals("x") && p == 1 && gameBoard[2] != "O") {
            return 2;
        } else if (gameBoard[4].equals("x") && p == 2 && gameBoard[6] != "O") {
            return 6;
        } else if(gameBoard[4].equals("x") && p == 3 && gameBoard[8] != "O")
            return 8;
        return 3;
    }public int gameTwoBot(){
        if (gameBoard[0].equalsIgnoreCase("o") && gameBoard[1].equalsIgnoreCase("o")) {
            return 2;
        } else if (gameBoard[1].equalsIgnoreCase("o") && gameBoard[2].equalsIgnoreCase("o")) {
            return 0;
        } else if (gameBoard[0].equalsIgnoreCase("o") && gameBoard[2].equalsIgnoreCase("o")) {
            return 1;
        } else if (gameBoard[3].equalsIgnoreCase("o") && gameBoard[4].equalsIgnoreCase("o")) {
            return 5;
        } else if (gameBoard[3].equalsIgnoreCase("o") && gameBoard[5].equalsIgnoreCase("o")) {
            return 4;
        } else if (gameBoard[4].equalsIgnoreCase("o") && gameBoard[5].equalsIgnoreCase("o")) {
            return 3;
        } else if (gameBoard[6].equalsIgnoreCase("o") && gameBoard[7].equalsIgnoreCase("o")) {
            return 8;
        } else if (gameBoard[6].equalsIgnoreCase("o") && gameBoard[8].equalsIgnoreCase("o")) {
            return 7;
        } else if (gameBoard[7].equalsIgnoreCase("o") && gameBoard[8].equalsIgnoreCase("o")) {
            return 6;
        } else if ((gameBoard[0].equalsIgnoreCase("o") && gameBoard[3].equalsIgnoreCase("o"))) {
            return 6;
        } else if (gameBoard[0].equalsIgnoreCase("o") && gameBoard[6].equalsIgnoreCase("o")) {
            return 3;
        } else if (gameBoard[3].equalsIgnoreCase("o") && gameBoard[6].equalsIgnoreCase("o")) {
            return 0;
        } else if (gameBoard[1].equalsIgnoreCase("o") && gameBoard[4].equalsIgnoreCase("o")) {
            return 7;
        } else if (gameBoard[1].equalsIgnoreCase("o") && gameBoard[7].equalsIgnoreCase("o")) {
            return 4;
        } else if (gameBoard[4].equalsIgnoreCase("o") && gameBoard[7].equalsIgnoreCase("o")) {
            return 1;
        } else if (gameBoard[2].equalsIgnoreCase("o") && gameBoard[5].equalsIgnoreCase("o")) {
            return 8;
        } else if (gameBoard[2].equalsIgnoreCase("o") && gameBoard[8].equalsIgnoreCase("o")) {
            return 5;
        } else if (gameBoard[5].equalsIgnoreCase("o") && gameBoard[8].equalsIgnoreCase("o")) {
            return 2;
        } else if (gameBoard[0].equalsIgnoreCase("o") && gameBoard[4].equalsIgnoreCase("o")) {
            return 8;
        } else if (gameBoard[0].equalsIgnoreCase("o") && gameBoard[8].equalsIgnoreCase("o")) {
            return 4;
        } else if (gameBoard[4].equalsIgnoreCase("o") && gameBoard[8].equalsIgnoreCase("o")) {
            return 0;
        } else if (gameBoard[2].equalsIgnoreCase("o") && gameBoard[4].equalsIgnoreCase("o")) {
            return 6;
        } else if (gameBoard[2].equalsIgnoreCase("o") && gameBoard[6].equalsIgnoreCase("o")) {
            return 4;
        } else if (gameBoard[4].equalsIgnoreCase("o") && gameBoard[6].equalsIgnoreCase("o")) {
            return 2;
        } else if (gameBoard[0].equalsIgnoreCase("x") && gameBoard[1].equalsIgnoreCase("x")) {
            return 2;
        } else if (gameBoard[1].equalsIgnoreCase("x") && gameBoard[2].equalsIgnoreCase("x")) {
            return 0;
        } else if (gameBoard[0].equalsIgnoreCase("x") && gameBoard[2].equalsIgnoreCase("x")) {
            return 1;
        } else if (gameBoard[3].equalsIgnoreCase("x") && gameBoard[4].equalsIgnoreCase("x")) {
            return 5;
        } else if (gameBoard[3].equalsIgnoreCase("x") && gameBoard[5].equalsIgnoreCase("x")) {
            return 4;
        } else if (gameBoard[4].equalsIgnoreCase("x") && gameBoard[5].equalsIgnoreCase("x")) {
            return 3;
        } else if (gameBoard[6].equalsIgnoreCase("x") && gameBoard[7].equalsIgnoreCase("x")) {
            return 8;
        } else if (gameBoard[6].equalsIgnoreCase("x") && gameBoard[8].equalsIgnoreCase("x")) {
            return 7;
        } else if (gameBoard[7].equalsIgnoreCase("x") && gameBoard[8].equalsIgnoreCase("x")) {
            return 6;
        } else if ((gameBoard[0].equalsIgnoreCase("x") && gameBoard[3].equalsIgnoreCase("x"))) {
            return 6;
        } else if (gameBoard[0].equalsIgnoreCase("x") && gameBoard[6].equalsIgnoreCase("x")) {
            return 3;
        } else if (gameBoard[3].equalsIgnoreCase("x") && gameBoard[6].equalsIgnoreCase("x")) {
            return 0;
        } else if (gameBoard[1].equalsIgnoreCase("x") && gameBoard[4].equalsIgnoreCase("x")) {
            return 7;
        } else if (gameBoard[1].equalsIgnoreCase("x") && gameBoard[7].equalsIgnoreCase("x")) {
            return 4;
        } else if (gameBoard[4].equalsIgnoreCase("x") && gameBoard[7].equalsIgnoreCase("x")) {
            return 1;
        } else if (gameBoard[2].equalsIgnoreCase("x") && gameBoard[5].equalsIgnoreCase("x")) {
            return 8;
        } else if (gameBoard[2].equalsIgnoreCase("x") && gameBoard[8].equalsIgnoreCase("x")) {
            return 5;
        } else if (gameBoard[5].equalsIgnoreCase("x") && gameBoard[8].equalsIgnoreCase("x")) {
            return 2;
        } else if (gameBoard[0].equalsIgnoreCase("x") && gameBoard[4].equalsIgnoreCase("x")) {
            return 8;
        } else if (gameBoard[0].equalsIgnoreCase("x") && gameBoard[8].equalsIgnoreCase("x")) {
            return 4;
        } else if (gameBoard[4].equalsIgnoreCase("x") && gameBoard[8].equalsIgnoreCase("x")) {
            return 0;
        } else if (gameBoard[2].equalsIgnoreCase("x") && gameBoard[4].equalsIgnoreCase("x")) {
            return 6;
        } else if (gameBoard[2].equalsIgnoreCase("x") && gameBoard[6].equalsIgnoreCase("x")) {
            return 4;
        } else if (gameBoard[4].equalsIgnoreCase("x") && gameBoard[6].equalsIgnoreCase("x")) {
            return 2;
        } else if (gameBoard[4].equals("x") && p == 0 && gameBoard[0] != "O") {
            return 0;
        } else if (gameBoard[4].equals("x") && p == 1 && gameBoard[2] != "O") {
            return 2;
        } else if (gameBoard[4].equals("x") && p == 2 && gameBoard[6] != "O") {
            return 6;
        } else if(gameBoard[4].equals("x") && p == 3 && gameBoard[8] != "O")
            return 8;
        return 3;
    }
}
