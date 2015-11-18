package Java;

import Models.AddModel;
import Models.AverageModel;
import Models.MultiplyModel;
import Models.SubtractModel;

import java.util.ArrayList;

/**
 * Class for all inserts into the database
 */
public class DataInsert {
    public void insertAverage(ArrayList<Integer> list, AverageModel averageModel){
        averageModel.setNumbers(list);
    }

    public void insertAdd(ArrayList<Integer> list, AddModel addModel){
        addModel.setNumbers(list);
    }

    public void insertSubtract(ArrayList<Integer> list, SubtractModel subtractModel){
        subtractModel.setNumbers(list);
    }

    public void insertMultiply(ArrayList<Integer> list, MultiplyModel multiplyModel){
        multiplyModel.setNumbers(list);
    }
}
