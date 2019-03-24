package study.pattern.abstractfactory;

/**
 * 华为手机壳
 */
public class HuaweiPhoneShell implements PhoneShellProduct {

    public HuaweiPhoneShell() {
        System.out.println("生产了一个华为手机壳...");
    }

    @Override
    public void getPrice() {
        System.out.println("华为手机壳 56 元");
    }

}
