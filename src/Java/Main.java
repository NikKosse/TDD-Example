package Java;

import Models.AddModel;
import Models.AverageModel;
import Models.MultiplyModel;
import Models.SubtractModel;


/**
 * Primary class for the project
 */
public class Main {

    public static void main(String[] args) {
        //models for the four functions
        AddModel addModel = new AddModel();
        AverageModel averageModel = new AverageModel();
        SubtractModel subtractModel = new SubtractModel();
        MultiplyModel multiplyModel = new MultiplyModel();

        //object instances
        FileReader reader = new FileReader();
        Calculator calculator = new Calculator();
        reader.readFile();

        //calling the four functions and filling the models with results
        averageModel.setAverage(calculator.averageNumbers(averageModel.getNumbers()));
        addModel.setSum(calculator.addNumbers(addModel.getNumbers()));
        subtractModel.setDifference(calculator.subtractNumbers(subtractModel.getNumbers()));
        multiplyModel.setProduct(calculator.multiplyNumbers(multiplyModel.getNumbers()));

    }
}