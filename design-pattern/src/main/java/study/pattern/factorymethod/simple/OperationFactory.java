package study.pattern.factorymethod.simple;

import study.pattern.factorymethod.Operation;

/**
 * 运算创建简单工厂接口（具体的工厂负责具体的产品）
 */
public interface OperationFactory {

    /**
     * 创建运算对象
     */
    Operation createOperation();

}
