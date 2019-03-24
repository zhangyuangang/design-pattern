package study.pattern.factorymethod.simple;

import study.pattern.factorymethod.Operation;

/**
 * 减法运算创建工厂
 */
public class SubtractionFactory implements OperationFactory {

    @Override
    public Operation createOperation() {
        return new Subtraction();
    }

}
