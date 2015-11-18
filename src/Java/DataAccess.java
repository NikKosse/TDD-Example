package Java;

import Models.AddModel;
import Models.AverageModel;
import Models.MultiplyModel;
import Models.SubtractModel;

/**
 * Class for all queries against the database
 */
public class DataAccess {
    public double getAverage(AverageModel averageModel){
        return averageModel.getAverage();
    }

    public int getSum(AddModel addModel){
        return addModel.getSum();
    }

    public int getDifference(SubtractModel subtractModel){
        return subtractModel.getDifference();
    }

    public int getProduct(MultiplyModel multiplyModel){
        return multiplyModel.getProduct();
    }

}
