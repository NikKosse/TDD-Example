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
        //list of lists to hold the different lists of numbers
        ArrayList<ArrayList<Integer>> lists;

        //instances of models for the four functions
        AddModel addModel = new AddModel();
        AverageModel averageModel = new AverageModel();
        SubtractModel subtractModel = new SubtractModel();
        MultiplyModel multiplyModel = new MultiplyModel();

        //object instances
        FileReader reader = new FileReader();
        Calculator calculator = new Calculator();

        //dataInsert and dataAccess instances
        DataAccess dataAccess = new DataAccess();
        DataInsert dataInsert = new DataInsert();

        //read file in
        lists = reader.readFile();

        //fill the data into each model
        dataInsert.insertAverage(lists.get(0), averageModel);
        dataInsert.insertAdd(lists.get(1), addModel);
        dataInsert.insertSubtract(lists.get(2), subtractModel);
        dataInsert.insertMultiply(lists.get(3), multiplyModel);

        //calling the four functions and filling the models with results
        averageModel.setAverage(calculator.averageNumbers(averageModel.getNumbers()));
        addModel.setSum(calculator.addNumbers(addModel.getNumbers()));
        subtractModel.setDifference(calculator.subtractNumbers(subtractModel.getNumbers()));
        multiplyModel.setProduct(calculator.multiplyNumbers(multiplyModel.getNumbers()));

        //get results from the models
        double average = dataAccess.getAverage(averageModel);
        int sum = dataAccess.getSum(addModel);
        int difference = dataAccess.getDifference(subtractModel);
        int product = dataAccess.getProduct(multiplyModel);

        //print results
        System.out.println("Average is: " + average);
        System.out.println("Sum is: " + sum);
        System.out.println("Difference is: " + difference);
        System.out.println("Product is: " + product);
    }
}