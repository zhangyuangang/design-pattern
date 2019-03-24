package study.pattern.builder;

/**
 * Director角色：汽车制造车间
 */
public class CarBuildWorkshop {

    private CarBuilder carBuilder;

    public CarBuildWorkshop(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car construct() {
        // 制造轮胎
        carBuilder.buildTyre();

        // 制造发动机
        carBuilder.buildEngine();

        // 制造车体
        carBuilder.buildCarBody();

        return carBuilder.getCar();
    }
}
