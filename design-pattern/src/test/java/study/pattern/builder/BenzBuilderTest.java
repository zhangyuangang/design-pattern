package study.pattern.builder;

import org.junit.Test;

public class BenzBuilderTest {

    @Test
    public void benzBuilderTest() {
        // 制造奔驰车
        CarBuilder benzBuilder = new BenzBuilder();
        CarBuildWorkshop benzBuildWorkshop = new CarBuildWorkshop(benzBuilder);
        Car benzCar = benzBuildWorkshop.construct();
        System.out.println(benzCar);

        System.out.println("-------------------------------");

        // 制造宝马车
        CarBuilder bmwBuilder = new BMWBuilder();
        CarBuildWorkshop bmwBuildWorkshop = new CarBuildWorkshop(bmwBuilder);
        Car bmwCar = bmwBuildWorkshop.construct();
        System.out.println(bmwCar);
    }

}