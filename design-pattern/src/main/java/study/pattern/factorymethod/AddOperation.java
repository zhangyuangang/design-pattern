package study.pattern.factorymethod;

/**
 * 加法运算
 */
public class AddOperation implements Operation {

    @Override
    public double getResult(double numberA, double numberB) {
        double result = numberA + numberB;

        System.out.println(numberA + " + " + numberB + " = " + result);

        return result;
    }

}
