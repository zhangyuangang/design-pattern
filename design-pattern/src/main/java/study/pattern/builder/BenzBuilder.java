package study.pattern.builder;

/**
 * 具体制造者：奔驰制造者
 */
public class BenzBuilder implements CarBuilder {

    private BenzCar benzCar;

    public BenzBuilder() {
        this.benzCar = new BenzCar();
    }

    @Override
    public void buildTyre() {
        benzCar.setTyre("德国制造轮胎");
    }

    @Override
    public void buildEngine() {
        benzCar.setEngine("日本制造发动机");
    }

    @Override
    public void buildCarBody() {
        benzCar.setCarBody("中国制造车体");
    }

    @Override
    public Car getCar() {
        return benzCar;
    }

}
