package study.pattern.factorymethod.simple;

import study.pattern.factorymethod.AddOperation;
import study.pattern.factorymethod.Operation;

/**
 * 加法运算创建工厂
 */
public class AddOperationFactory implements OperationFactory {

    @Override
    public Operation createOperation() {
        return new AddOperation();
    }

}
