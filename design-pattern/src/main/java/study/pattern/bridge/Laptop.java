package study.pattern.bridge;

/**
 * 笔记本类型电脑
 */
public class Laptop extends ComputerType {

    public Laptop(ComputerBrand computerBrand) {
        super(computerBrand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("笔记本");
    }

}
