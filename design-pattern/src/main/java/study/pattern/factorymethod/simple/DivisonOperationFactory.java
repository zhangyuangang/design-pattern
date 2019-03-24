package study.pattern.factorymethod.simple;

import study.pattern.factorymethod.DivisionOperation;
import study.pattern.factorymethod.Operation;

/**
 * 除法运算创建工厂
 */
public class DivisonOperationFactory implements OperationFactory {

    @Override
    public Operation createOperation() {
        return new DivisionOperation();
    }

}
