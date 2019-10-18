package at.technikum.if16b061;

import java.util.List;

public class CalculatorExtendedImpl implements Calculator {

    @Override
    public int sum(int... numbers){
        int sum = 0;
        for(int x: numbers){
            sum += x;
        }
        return sum;
    }
}
