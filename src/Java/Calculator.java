package Java;

import java.util.ArrayList;

/**
 * class to perform basic calculations
 */
public class Calculator {

    public double averageNumbers(ArrayList<Integer> numbers){
        double answer = 0;
        for (Integer e : numbers) answer += e;
        answer = answer/numbers.size();
        return answer;
    }

    public int addNumbers(ArrayList<Integer> numbers){
        int answer = 0;
        for (Integer e : numbers) answer += e;
        return answer;
    }

    public int subtractNumbers(ArrayList<Integer> numbers){
        int answer = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            answer = answer - numbers.get(i);
        }
        return answer;
    }

    public int multiplyNumbers(ArrayList<Integer> numbers){
        int answer = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            answer = answer*numbers.get(i);
        }
        return answer;
    }
}
