package org.mart8ins;

import java.util.ArrayList;
import java.util.List;

public class ValidateSudoku {

    public boolean validateRows(String[][] sudokuArray){
        boolean rowsAreValid = true;
        List<String> numberToCheck = new ArrayList<>();
        for(String[] arr: sudokuArray) {
            for(String n : arr) {
                if(!n.equals("0")) {
                    int index = numberToCheck.indexOf(n);
                    if(index != -1) {
                        rowsAreValid = false;
                        break;
                    }
                    numberToCheck.add(n);
                }
            }
            numberToCheck.clear();
        }
        return rowsAreValid;
    }

    public boolean validateCol(String[][] sudokuArray){
        String[][] colToRow = new String[9][9];
        for(int i =0; i < sudokuArray.length; i++) {
            for(int j = 0; j < sudokuArray[i].length; j++) {
                colToRow[j][i] = sudokuArray[i][j];
            }
        }
        return validateRows(colToRow);
    }

    public boolean validateBlock(){
        return false;
    }
}
