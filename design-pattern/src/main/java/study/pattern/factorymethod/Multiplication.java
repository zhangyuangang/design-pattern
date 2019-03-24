package study.pattern.factorymethod;

/**
 * 乘法运算
 */
public class Multiplication implements Operation {

    @Override
    public double getResult(double numberA, double numberB) {
        double result = numberA * numberB;

        System.out.println(numberA + " * " + numberB + " = " + result);

        return result;
    }

}
