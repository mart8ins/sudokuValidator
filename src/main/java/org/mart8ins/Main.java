package org.mart8ins;


public class Main {
    public static void main(String[] args) {
        ReadSudokuFile file = new ReadSudokuFile("/org.mart8ins/invalid_due_to_column_dupe.sudoku");
        file.readSudoku();

    }
}