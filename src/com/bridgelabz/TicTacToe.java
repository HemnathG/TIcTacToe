package com.bridgelabz;

public class TicTacToe {

    public static void main(String[] args) {
        System.out.println("*** Welcome to Tic Tac Toe Game ***");

        char[] ticTacBoard = new char[10];
        for(int index = 0; index < 10; index++) {
            ticTacBoard[index] = ' ';
        }
    }

}