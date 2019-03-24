package study.pattern.bridge;

/**
 * 电脑类型，代表电脑在类型这一维度的变化
 */
public abstract class ComputerType implements Computer {

    protected ComputerBrand computerBrand;

    public ComputerType(ComputerBrand computerBrand) {
        this.computerBrand = computerBrand;
    }

    @Override
    public void sale() {
        this.computerBrand.sale();
    }

}
