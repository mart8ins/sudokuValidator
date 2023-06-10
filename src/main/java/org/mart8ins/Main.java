package org.mart8ins;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ReadSudokuFile sudokuToValidate = new ReadSudokuFile("/org.mart8ins/invalid_due_to_column_dupe.sudoku");
        String sudoku = sudokuToValidate.readSudoku();
        String[][] sudokuArray = FormatSudoku.generateTwoDimensionalArray(sudoku);
        System.out.println(Arrays.toString(sudokuArray[0]));

    }
}