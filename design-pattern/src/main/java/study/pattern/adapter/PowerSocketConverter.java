package study.pattern.adapter;

/**
 * 电源插座转换器
 * 这里模拟适配器模式中的适配器
 */
public class PowerSocketConverter implements ThreeHolePlug {

    private BedElectricSocketWithTwoHole bedElectricSocket;

    public PowerSocketConverter(BedElectricSocketWithTwoHole bedElectricSocket) {
        this.bedElectricSocket = bedElectricSocket;
    }

    @Override
    public void getPowerWithThreeHole() {
        System.out.println("使用电源插座转换器开始转换...");

        this.bedElectricSocket.getPowerWithTwoHole();
    }

}
