package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 * Reads in files
 */
public class FileReader {

    public ArrayList<ArrayList<Integer>> readFile(){
        ArrayList<ArrayList<Integer>> allData = new ArrayList<>();
        ArrayList<Integer> average = new ArrayList<>();
        ArrayList<Integer> add = new ArrayList<>();
        ArrayList<Integer> subtract = new ArrayList<>();
        ArrayList<Integer> multiply = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader("C:\\Users\\Nikolas\\IdeaProjects\\TDD-example\\out\\production\\TDD-example\\Data\\data.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                if(line.equals("Average")){
                    while(!(line = reader.readLine()).equals("")){
                        average.add(Integer.parseInt(line));
                    }
                }
                else if(line.equals("Add")){
                    while(!(line = reader.readLine()).equals("")){
                        add.add(Integer.parseInt(line));
                    }
                }
                else if(line.equals("Subtract")){
                    while(!(line = reader.readLine()).equals("")){
                        subtract.add(Integer.parseInt(line));
                    }
                }
                else if(line.equals("Multiply")){
                    while((line = reader.readLine()) != null){
                        multiply.add(Integer.parseInt(line));
                    }
                }
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        allData = combineLists(average, add, subtract, multiply);
        return allData;
    }

    public ArrayList<ArrayList<Integer>> combineLists(ArrayList average, ArrayList add, ArrayList subtract, ArrayList multiply){
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(average);
        listOfLists.add(add);
        listOfLists.add(subtract);
        listOfLists.add(multiply);
        return listOfLists;
    }
}