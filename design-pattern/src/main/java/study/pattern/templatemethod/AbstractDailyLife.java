package study.pattern.templatemethod;

/**
 * @author jiangsj
 *
 * 模拟如下场景：
 * 我和女朋友的日常生活
 */
public abstract class AbstractDailyLife {

    /**
     * 晨练
     * 女朋友喜欢睡懒觉，她不做晨练
     */
    void doMorningExercise() {}

    abstract void eatBreakfast();

    abstract void work();

    abstract void eatDinner();

    /**
     * 睡前读书
     * 我比较懒，不经常进行睡前读书
     */
    void readBooks() {}

    void goToBed() {
        System.out.println("上床睡觉");
    }

    public void dailyLife() {
        // 1. 晨练，开启美好的一天
        doMorningExercise();

        // 2. 吃早餐
        eatBreakfast();

        // 3. 工作
        work();

        // 4.吃晚饭
        eatDinner();

        // 5. 睡前读书
        readBooks();

        // 6. 睡觉
        goToBed();
    }
}
