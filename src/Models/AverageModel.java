package Models;

import java.util.ArrayList;

/**
 * Model for the average data
 */
public class AverageModel {
    public ArrayList<Integer> numbers;
    public double average;

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

//    public double getAverage() {
//        return average;
//    }

    public void setAverage(double average) {
        this.average = average;
    }
}
