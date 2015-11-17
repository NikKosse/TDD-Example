package Java;

import Models.AddModel;
import Models.AverageModel;
import Models.MultiplyModel;
import Models.SubtractModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 * Reads in files
 */
public class FileReader {
    AddModel addModel = new AddModel();
    AverageModel averageModel = new AverageModel();
    SubtractModel subtractModel = new SubtractModel();
    MultiplyModel multiplyModel = new MultiplyModel();

    public void readFile() {
        ArrayList<Integer> average = new ArrayList<>();
        ArrayList<Integer> add = new ArrayList<>();
        ArrayList<Integer> subtract = new ArrayList<>();
        ArrayList<Integer> multiply = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader("F:\\Intellij Projects\\TDD-example\\out\\production\\TDD-example\\Data\\data.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                switch (line) {
                    case "Average":
                        while (!(line = reader.readLine()).equals("")) {
                            average.add(Integer.parseInt(line));
                        }
                        break;
                    case "Add":
                        while (!(line = reader.readLine()).equals("")) {
                            add.add(Integer.parseInt(line));
                        }
                        break;
                    case "Subtract":
                        while (!(line = reader.readLine()).equals("")) {
                            subtract.add(Integer.parseInt(line));
                        }
                        break;
                    case "Multiply":
                        while ((line = reader.readLine()) != null) {
                            multiply.add(Integer.parseInt(line));
                        }
                        break;
                }
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        averageModel.setNumbers(average);
        addModel.setNumbers(add);
        subtractModel.setNumbers(subtract);
        multiplyModel.setNumbers(multiply);
    }

}