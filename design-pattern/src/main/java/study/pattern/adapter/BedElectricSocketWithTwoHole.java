package study.pattern.adapter;

/**
 * 床头两孔插座
 * 这里模拟适配器模式中的 adaptee (遗留接口或老接口)
 */
public class BedElectricSocketWithTwoHole {

    public void getPowerWithTwoHole() {
        System.out.println("使用两孔插头获取电源...");
    }

}