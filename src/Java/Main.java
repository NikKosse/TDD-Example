package Java;

import Models.AddModel;
import Models.AverageModel;
import Models.MultiplyModel;
import Models.SubtractModel;

import java.util.ArrayList;

/**
 * Primary class for the project
 */
public class Main {

    public static void main(String[] args) {
        AddModel addModel = new AddModel();
        AverageModel averageModel = new AverageModel();
        SubtractModel subtractModel = new SubtractModel();
        MultiplyModel multiplyModel = new MultiplyModel();

        FileReader reader = new FileReader();
        Calculator calculator = new Calculator();
        ArrayList<ArrayList<Integer>> lists;
        lists = reader.readFile();

        double average = calculator.averageNumbers(lists.get(0));
        int sum = calculator.addNumbers(lists.get(1));
        int difference = calculator.subtractNumbers(lists.get(2));
        int product = calculator.multiplyNumbers(lists.get(3));

        addModel.setSum(sum);
        averageModel.setAverage(average);
        subtractModel.setDifference(difference);
        multiplyModel.setProduct(product);
    }
}