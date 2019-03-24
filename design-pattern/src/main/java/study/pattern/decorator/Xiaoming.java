package study.pattern.decorator;

/**
 * 主体：小明
 * 这里模拟装饰器模式中被装饰（加强、附加责任）的对象
 */
public class Xiaoming implements Human {

    @Override
    public void eat() {
        System.out.println("小明吃饭...");
    }

    @Override
    public void findLove() {
        System.out.println("小明找对象...");
    }

}
