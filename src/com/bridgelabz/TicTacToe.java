package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;


public class TicTacToe {

    public static Scanner scanner = new Scanner(System.in);
    public static final Random randomGenerator = new Random();
    static char[] board = new char[10];
    static char player,computer;
    public static int playLocation;
    public static boolean playerWinToss;
    public static boolean isWinner = false;
    public static int tossResult;

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
        System.out.println();
        System.out.println("  " + board[1] + "  |  " + board[2]  + "   | " + board[3] + "  ");
        System.out.println("------------------");
        System.out.println("  " + board[4] + "  |  " + board[5]  + "   | " + board[6] + "  ");
        System.out.println("------------------");
        System.out.println("  " + board[7] + "  |  " + board[8]  + "   | " + board[9] + "  ");
    }

    public static void userMove() {

        System.out.println("Player Is Playing");
        System.out.println("Enter Location 1-9 to Make Move");

        while (true) {

            playLocation = scanner.nextInt();
            scanner.nextLine();
            if (isEmpty(playLocation) && playLocation < 10 && playLocation > 0) {

                board[playLocation] = player;
                showBoard();
                break;
            } else {
                System.out.println("Invalid Choice. Please Enter position again.");

            }
        }
    }
        public static void computerMove() {
            System.out.println("Computer Is Playing");
            do {
                int cornerLocation = randomGenerator.nextInt(4) + 1;
                if (predictWinLocationAndBlock()) {
                }
                else {
                    if(cornerLocation == 1)
                        playLocation = 1;
                    if(cornerLocation == 2)
                        playLocation = 3;
                    if(cornerLocation == 3)
                        playLocation = 7;
                    if(cornerLocation == 4)
                        playLocation = 9;
                }

            } while (!isEmpty(playLocation));
            board[playLocation] = computer;
            showBoard();
        }

    public static boolean predictWinLocationAndBlock() {
        if (board[1] == computer && board[2] == computer && board[3] == ' ') {
            playLocation = 3;
            return true;
        }
        if (board[1] == computer && board[3] == computer && board[2] == ' ') {
            playLocation = 2;
            return true;
        }
        if (board[3] == computer && board[2] == computer && board[1] == ' ') {
            playLocation = 1;
            return true;
        }
        if (board[4] == computer && board[5] == computer && board[6] == ' ') {
            playLocation = 6;
            return true;
        }
        if (board[4] == computer && board[6] == computer && board[5] == ' ') {
            playLocation = 5;
            return true;
        }
        if (board[6] == computer && board[5] == computer && board[4] == ' ') {
            playLocation = 4;
            return true;
        }
        if (board[7] == computer && board[8] == computer && board[9] == ' ') {
            playLocation = 9;
            return true;
        }
        if (board[7] == computer && board[9] == computer && board[8] == ' ') {
            playLocation = 8;
            return true;
        }
        if (board[9] == computer && board[8] == computer && board[7] == ' ') {
            playLocation = 7;
            return true;
        }
        if (board[1] == computer && board[4] == computer && board[7] == ' ') {
            playLocation = 7;
            return true;
        }
        if (board[1] == computer && board[7] == computer && board[4] == ' ') {
            playLocation = 4;
            return true;
        }
        if (board[7] == computer && board[4] == computer && board[1] == ' ') {
            playLocation = 1;
            return true;
        }
        if (board[2] == computer && board[5] == computer && board[8] == ' ') {
            playLocation = 8;
            return true;
        }
        if (board[2] == computer && board[8] == computer && board[5] == ' ') {
            playLocation = 5;
            return true;
        }
        if (board[8] == computer && board[5] == computer && board[2] == ' ') {
            playLocation = 2;
            return true;
        }
        if (board[3] == computer && board[6] == computer && board[9] == ' ') {
            playLocation = 9;
            return true;
        }
        if (board[3] == computer && board[9] == computer && board[6] == ' ') {
            playLocation = 6;
            return true;
        }
        if (board[9] == computer && board[6] == computer && board[3] == ' ') {
            playLocation = 3;
            return true;
        }
        if (board[1] == computer && board[5] == computer && board[9] == ' ') {
            playLocation = 9;
            return true;
        }
        if (board[1] == computer && board[9] == computer && board[5] == ' ') {
            playLocation = 5;
            return true;
        }
        if (board[9] == computer && board[5] == computer && board[1] == ' ') {
            playLocation = 1;
            return true;
        }
        if (board[3] == computer && board[5] == computer && board[7] == ' ') {
            playLocation = 7;
            return true;
        }
        if (board[3] == computer && board[7] == computer && board[5] == ' ') {
            playLocation = 5;
            return true;
        }
        if (board[7] == computer && board[5] == computer && board[3] == ' ') {
            playLocation = 3;
            return true;
        }
        if (board[1] == player && board[2] == player && board[3] == ' ') {
            playLocation = 3;
            return true;
        }
        if (board[1] == player && board[3] == player && board[2] == ' ') {
            playLocation = 2;
            return true;
        }
        if (board[3] == player && board[2] == player && board[1] == ' ') {
            playLocation = 1;
            return true;
        }
        if (board[4] == player && board[5] == player && board[6] == ' ') {
            playLocation = 6;
            return true;
        }
        if (board[4] == player && board[6] == player && board[5] == ' ') {
            playLocation = 5;
            return true;
        }
        if (board[6] == player && board[5] == player && board[4] == ' ') {
            playLocation = 4;
            return true;
        }
        if (board[7] == player && board[8] == player && board[9] == ' ') {
            playLocation = 9;
            return true;
        }
        if (board[7] == player && board[9] == player && board[8] == ' ') {
            playLocation = 8;
            return true;
        }
        if (board[9] == player && board[8] == player && board[7] == ' ') {
            playLocation = 7;
            return true;
        }
        if (board[1] == player && board[4] == player && board[7] == ' ') {
            playLocation = 7;
            return true;
        }
        if (board[1] == player && board[7] == player && board[4] == ' ') {
            playLocation = 4;
            return true;
        }
        if (board[7] == player && board[4] == player && board[1] == ' ') {
            playLocation = 1;
            return true;
        }
        if (board[2] == player && board[5] == player && board[8] == ' ') {
            playLocation = 8;
            return true;
        }
        if (board[2] == player && board[8] == player && board[5] == ' ') {
            playLocation = 5;
            return true;
        }
        if (board[8] == player && board[5] == player && board[2] == ' ') {
            playLocation = 2;
            return true;
        }
        if (board[3] == player && board[6] == player && board[9] == ' ') {
            playLocation = 9;
            return true;
        }
        if (board[3] == player && board[9] == player && board[6] == ' ') {
            playLocation = 6;
            return true;
        }
        if (board[9] == player && board[6] == player && board[3] == ' ') {
            playLocation = 3;
            return true;
        }
        if (board[1] == player && board[5] == player && board[9] == ' ') {
            playLocation = 9;
            return true;
        }
        if (board[1] == player && board[9] == player && board[5] == ' ') {
            playLocation = 5;
            return true;
        }
        if (board[9] == player && board[5] == player && board[1] == ' ') {
            playLocation = 1;
            return true;
        }
        if (board[3] == player && board[5] == player && board[7] == ' ') {
            playLocation = 7;
            return true;
        }
        if (board[3] == player && board[7] == player && board[5] == ' ') {
            playLocation = 5;
            return true;
        }
        if (board[7] == player && board[5] == player && board[3] == ' ') {
            playLocation = 3;
            return true;
        } else
            return false;
    }

    public static boolean isEmpty(int location) {

        return board[location] == ' ';
    }

    public static void checkToss() {

        double tossResult = Math.floor(Math.random() * 10) % 2;
        //System.out.println("Random Toss Value :"+tossResult);
        System.out.println("Choose 1 for Heads or 2 for Tails");
        int coinSelect = scanner.nextInt();
        if (coinSelect == tossResult) {
            System.out.println("Player Won The Toss! Player Starts");
        } else {
            System.out.println("Computer Won The Toss! Computer Starts");
        }
    }


    public static boolean checkBoardFull() {
        if ((board[1] != ' ') && (board[2] != ' ') && (board[3] != ' ') && (board[4] != ' ') && (board[5] != ' ')
                && (board[6] != ' ') && (board[7] != ' ') && (board[8] != ' ') && (board[9] != ' ')) {

            return true;
        }
        return false;
    }

    public static boolean checkWinner() {
        if (isWinner)
            return true;
        if ((board[1] == player && board[2] == player && board[3] == player)
                || (board[4] == player && board[5] == player && board[6] == player)
                || (board[7] == player && board[8] == player && board[9] == player)
                || (board[1] == player && board[4] == player && board[7] == player)
                || (board[2] == player && board[5] == player && board[8] == player)
                || (board[3] == player && board[6] == player && board[9] == player)
                || (board[1] == player && board[5] == player && board[9] == player)
                || (board[3] == player && board[5] == player && board[7] == player)) {
            System.out.println("Player is the WINNER!!");
            isWinner = true;
            return true;
        }

        if ((board[1] == computer && board[2] == computer && board[3] == computer)
                || (board[4] == computer && board[5] == computer && board[6] == computer)
                || (board[7] == computer && board[8] == computer && board[9] == computer)
                || (board[1] == computer && board[4] == computer && board[7] == computer)
                || (board[2] == computer && board[5] == computer && board[8] == computer)
                || (board[3] == computer && board[6] == computer && board[9] == computer)
                || (board[1] == computer && board[5] == computer && board[9] == computer)
                || (board[3] == computer && board[5] == computer && board[7] == computer)) {
            System.out.println("Computer is the WINNER");
            isWinner = true;
            return true;
        }

        return false;
    }

    public static void startGame() {
        do {
            if (playerWinToss) {
                userMove();
                if (!checkBoardFull())
                    computerMove();
            } else {
                computerMove();
                if (!checkBoardFull())
                    userMove();
            }
        } while (!checkWinner() && !checkBoardFull());
        if (checkBoardFull() && !checkWinner())
            System.out.println("Game TIED.");

    }

    public static void main(String[] args) {

        System.out.println("----- Welcome To The Game Of Tic Tac Toe -----");
        createBoard();
        getPlayerChoice();
        checkToss();
        startGame();

    }

}
