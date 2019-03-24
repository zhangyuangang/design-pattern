package study.pattern.bridge;

/**
 * Pad 类型电脑
 */
public class Pad extends ComputerType {

    public Pad(ComputerBrand computerBrand) {
        super(computerBrand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("Pad");
    }

}
