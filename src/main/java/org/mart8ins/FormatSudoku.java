package org.mart8ins;

import java.util.Arrays;

public class FormatSudoku {
    public static String[][] generateTwoDimensionalArray(String sudoku){
        String[] cleanedSudoku = sudoku.replaceAll("[-+\\|\s]", "").split("\n+");
        String[][] sudokuArray = new String[9][9];
        for (int i = 0; i < cleanedSudoku.length; i++) {
            sudokuArray[i] = cleanedSudoku[i].split("");
        }
        return sudokuArray;
    }
}
