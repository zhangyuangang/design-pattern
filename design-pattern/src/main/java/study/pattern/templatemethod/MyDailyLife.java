package study.pattern.templatemethod;

/**
 * @author jiangsj
 *
 * 我的日常生活
 *
 */
public class MyDailyLife extends AbstractDailyLife {

    @Override
    void doMorningExercise() {
        System.out.println("做晨练，开始一天的生活");
    }

    @Override
    void eatBreakfast() {
        System.out.println("吃早餐，牛奶面包加鸡蛋");
    }

    @Override
    void work() {
        System.out.println("去公司工作，开始写代码");
    }

    @Override
    void eatDinner() {
        System.out.println("吃晚餐，小米粥，馒头，酸辣土豆丝");
    }

}
