package study.pattern.factorymethod;

import org.junit.Test;
import study.pattern.factorymethod.simple.*;
import study.pattern.factorymethod.statics.OperationStaticFactory;

public class OperationFactoryTest {

    @Test
    public void operationSimpleFactoryTest() {
        // 加法运算
        OperationFactory addOperationFactory = new AddOperationFactory();
        Operation addOperation = addOperationFactory.createOperation();
        addOperation.getResult(5, 8);

        System.out.println("-----------------------");

        // 减法运算
        OperationFactory subtractionFactory = new SubtractionFactory();
        Operation subtraction = subtractionFactory.createOperation();
        subtraction.getResult(12, 4);

        System.out.println("-----------------------");

        // 乘法运算
        OperationFactory multiplicationFactory = new MultiplicationFactory();
        Operation multiplication = multiplicationFactory.createOperation();
        multiplication.getResult(12.1, 23.6);

        System.out.println("-----------------------");

        // 除法运算
        OperationFactory divisionOperationFactory = new DivisonOperationFactory();
        Operation divisionOperation = divisionOperationFactory.createOperation();
        divisionOperation.getResult(22.6, 1.6);
    }

    @Test
    public void operationStaticFactoryTest() {
        // 加法运算
        Operation addOperation = OperationStaticFactory.createOperation("+");
        addOperation.getResult(11.5, 24.7);

        System.out.println("-----------------------");

        // 减法运算
        Operation subtraction = OperationStaticFactory.createOperation("-");
        subtraction.getResult(55.78, 86.53);

        System.out.println("-----------------------");

        // 乘法运算
        Operation multiplication = OperationStaticFactory.createOperation("*");
        multiplication.getResult(66.98, 12.6);

        System.out.println("-----------------------");

        // 除法运算
        Operation divisionOperation = OperationStaticFactory.createOperation("/");
        divisionOperation.getResult(4574.34, 23.56);
    }

}