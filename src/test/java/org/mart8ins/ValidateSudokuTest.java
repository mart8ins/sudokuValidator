package org.mart8ins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidateSudokuTest {
    ValidateSudoku validateSudoku = new ValidateSudoku();

    @Test
    @DisplayName("Valid full sudoku, check for valid rows")
    void validateRowsFullValid() {
        String[][] toTest = {
                {"8", "5", "9", "6", "1", "2", "4", "3", "7"},
                {"7", "2", "3", "8", "5", "4", "1", "6", "9"},
                {"1", "6", "4", "3", "7", "9", "5", "2", "8"},
                {"9", "8", "6", "1", "4", "7", "3", "5", "2"},
                {"3", "7", "5", "2", "6", "8", "9", "1", "4"},
                {"2", "4", "1", "5", "9", "3", "7", "8", "6"},
                {"4", "3", "2", "9", "8", "1", "6", "7", "5"},
                {"6", "1", "7", "4", "2", "5", "8", "9", "3"},
                {"5", "9", "8", "7", "3", "6", "2", "4", "1"},
        };
        boolean result = validateSudoku.validateRows(toTest);
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Valid partly full sudoku, check for valid rows")
    void validateRowsPartlyFullValid() {
        String[][] toTest = {
                {"8", "5", "9", "6", "1", "2", "4", "3", "7"},
                {"0", "0", "0", "0", "5", "0", "1", "6", "9"},
                {"0", "0", "0", "0", "0", "0", "0", "2", "0"},
                {"9", "8", "6", "1", "4", "7", "3", "5", "0"},
                {"3", "0", "5", "2", "6", "8", "9", "1", "0"},
                {"2", "4", "1", "5", "9", "3", "7", "8", "0"},
                {"4", "3", "2", "9", "8", "0", "6", "7", "0"},
                {"6", "1", "7", "4", "2", "5", "0", "9", "3"},
                {"5", "9", "8", "7", "3", "6", "2", "0", "0"},
        };
        boolean result = validateSudoku.validateRows(toTest);
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Invalid full sudoku, check for valid rows")
    void validateRowsFullInValid() {
        String[][] toTest = {
                {"8", "8", "9", "6", "1", "2", "4", "3", "7"},
                {"7", "2", "2", "8", "5", "4", "1", "6", "9"},
                {"1", "6", "4", "3", "7", "9", "5", "2", "8"},
                {"9", "8", "6", "1", "4", "7", "3", "5", "2"},
                {"3", "7", "5", "5", "6", "8", "9", "1", "4"},
                {"2", "4", "1", "5", "9", "3", "7", "8", "6"},
                {"4", "3", "2", "9", "8", "1", "6", "6", "5"},
                {"6", "1", "7", "4", "2", "5", "8", "9", "3"},
                {"5", "9", "8", "7", "3", "6", "2", "4", "1"},
        };
        boolean result = validateSudoku.validateRows(toTest);
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Invalid partly full sudoku, check for valid rows")
    void validateRowsPartlyFullInValid() {
        String[][] toTest = {
                {"8", "5", "9", "6", "1", "2", "4", "3", "7"},
                {"0", "5", "0", "0", "5", "0", "1", "6", "9"},
                {"0", "0", "0", "0", "0", "0", "0", "2", "0"},
                {"9", "8", "6", "1", "4", "4", "3", "5", "0"},
                {"3", "0", "5", "2", "6", "8", "9", "1", "0"},
                {"2", "4", "1", "5", "9", "3", "7", "8", "0"},
                {"4", "3", "2", "9", "8", "0", "6", "7", "0"},
                {"6", "1", "7", "4", "2", "5", "0", "9", "3"},
                {"5", "9", "8", "7", "3", "6", "2", "0", "0"},
        };
        boolean result = validateSudoku.validateRows(toTest);
        Assertions.assertFalse(result);
    }
}