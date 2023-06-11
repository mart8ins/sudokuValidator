package org.mart8ins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ValidateSudoku {

    private boolean validateRows(String[][] sudokuArray){
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

    private boolean validateCol(String[][] sudokuArray){
        String[][] colToRow = new String[9][9];
        for(int i =0; i < sudokuArray.length; i++) {
            for(int j = 0; j < sudokuArray[i].length; j++) {
                colToRow[j][i] = sudokuArray[i][j];
            }
        }
        return validateRows(colToRow);
    }

    private boolean validateBlock(String[][] sudokuArray){
        String[][] blocksArray = new String[9][9];

        List a = new ArrayList();
        List b = new ArrayList();
        List c = new ArrayList();
        int count = 0;
        int blockCount = 0;
        for(int i = 0; i < sudokuArray.length; i++) {
            if(count == 3) {
                count = 0;
                a.clear();
                b.clear();
                c.clear();
            }
            Collections.addAll(a, Arrays.copyOfRange(sudokuArray[i], 0, 3));
            Collections.addAll(b, Arrays.copyOfRange(sudokuArray[i], 3, 6));
            Collections.addAll(c, Arrays.copyOfRange(sudokuArray[i], 6, 9));
            count++;
            if(count == 3) {
                blockCount += 3;
                if(blockCount == 3) {
                    blocksArray[0] = Arrays.stream(a.toArray(new String[a.size()])).toArray(String[]::new);
                    blocksArray[1] = Arrays.stream(b.toArray(new String[a.size()])).toArray(String[]::new);
                    blocksArray[2] = Arrays.stream(c.toArray(new String[a.size()])).toArray(String[]::new);
                }
                if(blockCount == 6) {
                    blocksArray[3] = Arrays.stream(a.toArray(new String[a.size()])).toArray(String[]::new);
                    blocksArray[4] = Arrays.stream(b.toArray(new String[a.size()])).toArray(String[]::new);
                    blocksArray[5] = Arrays.stream(c.toArray(new String[a.size()])).toArray(String[]::new);
                }
                if(blockCount == 9) {
                    blocksArray[6] = Arrays.stream(a.toArray(new String[a.size()])).toArray(String[]::new);
                    blocksArray[7] = Arrays.stream(b.toArray(new String[a.size()])).toArray(String[]::new);
                    blocksArray[8] = Arrays.stream(c.toArray(new String[a.size()])).toArray(String[]::new);
                }
            }
        }
        return validateRows(blocksArray);
    }

    public boolean checkSudokuValidity(String[][] sudokuArray){
        boolean validRows = validateRows(sudokuArray);
        boolean validCols = validateCol(sudokuArray);
        boolean validBlocks = validateBlock(sudokuArray);
        return validRows && validCols && validBlocks;
    }
}
