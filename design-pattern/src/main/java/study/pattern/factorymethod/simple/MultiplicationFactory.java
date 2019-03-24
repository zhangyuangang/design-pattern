package study.pattern.factorymethod.simple;

import study.pattern.factorymethod.Multiplication;
import study.pattern.factorymethod.Operation;

/**
 * 乘法运算创建工厂
 */
public class MultiplicationFactory implements OperationFactory {

    @Override
    public Operation createOperation() {
        return new Multiplication();
    }

}
