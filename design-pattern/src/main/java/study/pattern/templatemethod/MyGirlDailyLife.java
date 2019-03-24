package study.pattern.templatemethod;

/**
 * @author jiangsj
 *
 * 女朋友的日常生活
 */
public class MyGirlDailyLife extends AbstractDailyLife {

    @Override
    void eatBreakfast() {
        System.out.println("吃早餐，油条豆浆加鸡蛋");
    }

    @Override
    void work() {
        System.out.println("开始工作，画原型，开会，写产品文档");
    }

    @Override
    void eatDinner() {
        System.out.println("吃晚餐，西贝凉皮加莜面");
    }

    @Override
    void readBooks() {
        System.out.println("读书，做内外兼修的女神");
    }

}
