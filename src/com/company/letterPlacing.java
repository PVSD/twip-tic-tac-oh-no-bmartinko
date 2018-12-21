package com.company;

/**
 * Created by bm846 on 12/21/18.
 */
public class letterPlacing {
    public int row;
    public int column;
    public String boardCheck[][];
    public String boardSetup;
    public letterPlacing(String a[][], int b, int c, String s){
        boardCheck = a;
        row = b;
        column = c;
        boardSetup = s;
    }
    public String letterPlacer(){
        boardCheck[row][column] = "x";

        return boardSetup;
    }

}
