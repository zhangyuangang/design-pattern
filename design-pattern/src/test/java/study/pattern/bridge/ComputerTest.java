package study.pattern.bridge;

import org.junit.Test;

public class ComputerTest {

    @Test
    public void saleComputerBridgeTest() {
        Computer shenzhouDesktop = new Desktop(new Shenzhou());
        shenzhouDesktop.sale();

        System.out.println("---------------------------");

        Computer lenovoLaptop = new Laptop(new Lenovo());
        lenovoLaptop.sale();

        System.out.println("---------------------------");

        Computer dellPad = new Pad(new Dell());
        dellPad.sale();
    }

}