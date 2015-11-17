package Models;

import java.util.ArrayList;

/**
 * Model for the subtract data
 */
public class SubtractModel {
    public ArrayList<Integer> numbers;
    public int difference;

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getDifference() {
        return difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }
}
