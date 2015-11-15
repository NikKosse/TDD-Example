package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Reads in files
 */
public class FileReader {

    public List<String> readFile(){
        List<String> lines = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader("C:\\Users\\Nikolas\\IdeaProjects\\TDD-example\\Data files\\data.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        return lines;
    }
}