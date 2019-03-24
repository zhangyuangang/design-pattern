package study.pattern.adapter;

/**
 * 联想笔记本电脑：使用三孔插头获取电源
 */
public class ThinkPadLaptop {

    private ThreeHolePlug threeHolePlug;

    public ThinkPadLaptop(ThreeHolePlug threeHolePlug) {
        this.threeHolePlug = threeHolePlug;
    }

    public void getPower() {
        System.out.println("我正在使用三孔插头获取电源...");
        this.threeHolePlug.getPowerWithThreeHole();
    }

}
