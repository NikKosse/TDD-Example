package Java;

import java.util.ArrayList;

/**
 * Primary class for the project
 */
public class Main {

    public static void main(String[] args) {
        FileReader reader = new FileReader();
        Calculator calculator = new Calculator();
        ArrayList<ArrayList<Integer>> lists;
        lists = reader.readFile();

        double average = calculator.averageNumbers(lists.get(0));
        int sum = calculator.addNumbers(lists.get(1));
        int difference = calculator.subtractNumbers(lists.get(2));
        int product = calculator.multiplyNumbers(lists.get(3));

        System.out.println("Average is: " + average);
        System.out.println("Sum is: " + sum);
        System.out.println("Difference is: " + difference);
        System.out.println("Product is: " + product);
    }
}