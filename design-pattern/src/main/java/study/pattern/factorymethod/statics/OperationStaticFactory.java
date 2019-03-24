package study.pattern.factorymethod.statics;

import study.pattern.factorymethod.AddOperation;
import study.pattern.factorymethod.DivisionOperation;
import study.pattern.factorymethod.Multiplication;
import study.pattern.factorymethod.Operation;
import study.pattern.factorymethod.simple.Subtraction;

/**
 * 操作运算静态创建工厂接口
 */
public class OperationStaticFactory {

    public static Operation createOperation(String operate) {
        Operation result = null;

        switch (operate) {
            case "+":
                result = new AddOperation();
                break;
            case "-":
                result = new Subtraction();
                break;
            case "*":
                result = new Multiplication();
                break;
            case "/":
                result = new DivisionOperation();
                break;
            default:
                System.out.println("传入的操作运算符非法");
        }

        return result;
    }
}
