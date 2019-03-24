package study.pattern.builder;

/**
 * 具体制造者：宝马制造者
 */
public class BMWBuilder implements CarBuilder {

    private BMWCar bmwCar;

    public BMWBuilder() {
        this.bmwCar = new BMWCar();
    }

    @Override
    public void buildTyre() {
        bmwCar.setTyre("英国制造轮胎");
    }

    @Override
    public void buildEngine() {
        bmwCar.setEngine("德国制造发动机");
    }

    @Override
    public void buildCarBody() {
        bmwCar.setCarBody("中国制造车体");
    }

    @Override
    public Car getCar() {
        return bmwCar;
    }

}
