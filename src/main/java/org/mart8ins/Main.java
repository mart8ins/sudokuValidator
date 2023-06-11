package org.mart8ins;

public class Main {
    public static void main(String[] args) {
        String[] sudokuPaths = {
                "/org.mart8ins/invalid_due_to_column_dupe.sudoku",
                "/org.mart8ins/invalid_due_to_row_dupe.sudoku",
                "/org.mart8ins/invalid_due_to_subgroup_dupe.sudoku",
                "/org.mart8ins/simple.sudoku",
                "/org.mart8ins/valid_complete.sudoku",
                "/org.mart8ins/valid_incomplete.sudoku"
        };

        for(int i = 0 ; i <sudokuPaths.length; i++) {
            SudokuReader sudokuReader = new SudokuReader(sudokuPaths[i]);
            String sudoku = sudokuReader.readSudoku();
            String[][] sudokuArray = FormatSudoku.generateTwoDimensionalArray(sudoku);
            ValidateSudoku validateSudoku = new ValidateSudoku();

            boolean isValid = validateSudoku.checkSudokuValidity(sudokuArray);
            if(isValid) {
                System.out.println("Sudoku is valid. Variant -  " + sudokuPaths[i]);
            } else {
                System.out.println("Invalid sudoku. Variant -  " + sudokuPaths[i]);
            }
        }
    }
}