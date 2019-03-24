package study.pattern.decorator;

import org.junit.Test;

public class BetterXiaomingTest {

    @Test
    public void betterXiaomingDecoratorTest() {
        // 不使用装饰器
        System.out.println("不使用装饰器：");
        Human xiaoming = new Xiaoming();
        xiaoming.eat();
        xiaoming.findLove();

        System.out.println("---------------------------");

        // 使用装饰器
        System.out.println("使用装饰器：");
        Human betterXiaoming = new BetterXiaoming(new Xiaoming());
        betterXiaoming.eat();
        betterXiaoming.findLove();
    }

}