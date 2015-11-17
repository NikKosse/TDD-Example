package Models;

import java.util.ArrayList;

/**
 * Model for the multiplication data
 */
public class MultiplyModel {
    public ArrayList<Integer> numbers;
    public int product;

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

//    public int getProduct() {
//        return product;
//    }

    public void setProduct(int product) {
        this.product = product;
    }
}
