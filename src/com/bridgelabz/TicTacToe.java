package com.bridgelabz;

public class TicTacToe {

    char[] board = new char[10];

    public void cb(){
        for (int i=1; i<board.length;i++)
        {
            board[i]=' ';

        }
    }
    public static void main(String[] args) {

        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.cb();

    }
}
