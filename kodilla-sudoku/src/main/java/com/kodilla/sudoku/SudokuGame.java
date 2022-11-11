package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGame {

    public boolean resolveSudoku() {
        System.out.println("Do you want to resolve new Sudoku? [y/n]");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input == "y") {
            return true;
        }
        if (input == "n") {
            return false;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
        }
    }
}
