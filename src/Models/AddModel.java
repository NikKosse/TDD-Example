package Models;

import java.util.ArrayList;

/**
 * Model for the add data
 */
public class AddModel {
    public ArrayList<Integer> numbers;
    public int sum;

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
