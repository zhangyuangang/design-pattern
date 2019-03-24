package study.pattern.factorymethod.simple;

import study.pattern.factorymethod.Operation;

/**
 * 减法运算
 */
public class Subtraction implements Operation {

    @Override
    public double getResult(double numberA, double numberB) {
        double result = numberA - numberB;

        System.out.println(numberA + " - " + numberB + " = " + result);

        return result;
    }

}
