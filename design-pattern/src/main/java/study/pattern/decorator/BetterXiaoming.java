package study.pattern.decorator;

/**
 * 具体的装饰器对象
 * 更好的小明，表达在“小明”的基础上，做任何事更加细致
 */
public class BetterXiaoming extends DecoratorHuman {

    public BetterXiaoming(Human human) {
        this.human = human;
    }

    @Override
    public void eat() {
        // 功能加强
        System.out.println("小明吃饭前要洗手...");
        // 调用原主体对象“小明”的方法
        this.human.eat();
        // 功能加强
        System.out.println("小明吃饭后也要洗手...");
    }

    @Override
    public void findLove() {
        // 功能加强
        System.out.println("小明找对象要青春靓丽气质佳的成都姑娘...");
        // 调用原主体对象“小明”的方法
        this.human.findLove();
        // 功能加强
        System.out.println("小明很喜欢这个对象，婚后生活幸福，造了个小小明...");
    }
}
