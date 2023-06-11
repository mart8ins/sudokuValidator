package org.mart8ins;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class SudokuReader {

    private String fileLocation;

    public SudokuReader(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public String readSudoku() {
        String sudoku = "";
        try {
            URL url = this.getClass().getResource(fileLocation);
            Path path = Path.of(url.toURI());
            for(String line: Files.readAllLines(path)) {
                sudoku+= line + "\n";
            }
        } catch (URISyntaxException e) {
            System.out.println("Wrong URI syntax");
        } catch (IOException e) {
            System.out.println("Problems reading file");
        }
        return sudoku;
    }
}
