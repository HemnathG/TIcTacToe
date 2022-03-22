package com.bridgelabz;

import java.util.Scanner;


public class TicTacToe {

    public static Scanner scanner = new Scanner(System.in);
    static char[] board = new char[10];
    static char player,computer;
    public static int playLocation;

    static void createBoard(){
        for(int index = 1 ; index<10 ; index++) {
            board[index] = ' ';
        }
    }

    static void getPlayerChoice() {
        System.out.print("select X or O : ");
        player = Character.toUpperCase(scanner.next().charAt(0));

        if (player == 'X')
            computer='O';
        else
            computer ='X';
        System.out.println("You have selected : " +player);
        System.out.println("Computer's choice is : " +computer);
    }

    static void showBoard() {
        System.out.println("  " + board[1] + "  |  " + board[2]  + "   | " + board[3] + "  ");
        System.out.println("  " + board[4] + "  |  " + board[5]  + "   | " + board[6] + "  ");
        System.out.println("  " + board[7] + "  |  " + board[8]  + "   | " + board[9] + "  ");
    }

    public static void userMove() {
        System.out.println("Enter Location 1-9 to Make Move");
        playLocation = scanner.nextInt();
        if (playLocation < 10 && playLocation > 0) {
            board[playLocation] = player;
            showBoard();
        } else {
            System.out.println("Invalid Choice");
        }
    }

    public static void main(String[] args) {

        System.out.println("----- Welcome To The Game Of Tic Tac Toe -----");
        createBoard();
        getPlayerChoice();
        showBoard();
        userMove();

    }

}
