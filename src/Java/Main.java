package Java;

import java.util.ArrayList;

/**
 * Primary class for the project
 */
public class Main {

    public static void main(String[] args) {
        FileReader reader = new FileReader();
        ArrayList<ArrayList<Integer>> lists;
        lists = reader.readFile();
        System.out.println(lists);
    }
}
