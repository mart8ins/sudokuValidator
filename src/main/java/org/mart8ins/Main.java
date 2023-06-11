package org.mart8ins;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SudokuReader sudokuReader = new SudokuReader("/org.mart8ins/valid_complete.sudoku");
        String sudoku = sudokuReader.readSudoku();

        String[][] sudokuArray = FormatSudoku.generateTwoDimensionalArray(sudoku);

        ValidateSudoku validateSudoku = new ValidateSudoku();
//        validateSudoku.validateRows(sudokuArray);
        validateSudoku.validateCol(sudokuArray);
    }
}