package Java;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Primary class for the project
 */
public class Main {

    public static void main(String[] args) {
        FileReader reader = new FileReader();
        ArrayList<String> lines;
        lines = reader.readFile();
    }
}
