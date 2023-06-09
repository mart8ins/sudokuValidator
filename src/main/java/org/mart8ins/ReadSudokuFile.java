package org.mart8ins;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class ReadSudokuFile {

    private String fileLocation;

    public ReadSudokuFile(String fileLoaction) {
        this.fileLocation = fileLoaction;
    }

    public void readSudoku(){
        InputStream inputStream = this.getClass().getResourceAsStream(fileLocation);
        InputStreamReader streamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        Stream<String> lines = bufferedReader.lines();
        lines.forEach(System.out::println);
    }


}
