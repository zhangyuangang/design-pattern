package study.pattern.bridge;

/**
 * 戴尔品牌电脑
 */
public class Dell extends ComputerBrand {

    @Override
    public void sale() {
        System.out.println("戴尔");
    }

}
