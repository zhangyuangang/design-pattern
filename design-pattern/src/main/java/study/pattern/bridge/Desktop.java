package study.pattern.bridge;

/**
 * 台式机类型电脑
 */
public class Desktop extends ComputerType {

    public Desktop(ComputerBrand computerBrand) {
        super(computerBrand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("台式机");
    }

}
