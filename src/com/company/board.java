package com.company;

public class board {

    public String[] boards;
    public String result;
    public board(String[] b){
        boards = b;
    }

    public String placement() {
        result = "\n " + boards[0] + " | " + boards[1] + " | " + boards[2] + " \n " + boards[3] + " | " + boards[4] +
                " | " + boards[5] +  "\n " + boards[6] + " | " + boards[7] + " | " + boards[8];

        return result;
    }
}
