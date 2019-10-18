package at.technikum.if16b061;

public class CalculatorFactory {
    public Calculator getCalculator(boolean simple){
        if (simple) {
            return new CalculatorSimpleImpl();
        }else{
            return new CalculatorExtendedImpl();
        }
    }
}
