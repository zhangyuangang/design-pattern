package study.pattern.adapter;

import org.junit.Test;

public class PowerSocketConverterTest {

    @Test
    public void powerSocketConverterTest() {
        ThinkPadLaptop thinkPad = new ThinkPadLaptop(new PowerSocketConverter(new BedElectricSocketWithTwoHole()));
        thinkPad.getPower();
    }

}