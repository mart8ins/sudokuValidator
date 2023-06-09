package org.mart8ins;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadSudokuFile {

    private String fileLocation;

    public ReadSudokuFile(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public void readSudoku() {
        try {
            URL url = this.getClass().getResource(fileLocation);
            Path path = Path.of(url.toURI());
            for(String line: Files.readAllLines(path)) {
                System.out.println(line);
            }
        } catch (URISyntaxException e) {
            System.out.println("Wrong URI syntax");
        } catch (IOException e) {
            System.out.println("Problems reading file");
        }
    }
}
