package at.technikum.if16b061;

import java.util.List;

public class CalculatorSimpleImpl implements Calculator {

    @Override
    public int sum(int... numbers){
        if(numbers.length > 2){
            throw new IllegalArgumentException();
        } else {
            int sum = 0;
            for(int x: numbers){
                sum += x;
            }
            return sum;
        }
    }
}
