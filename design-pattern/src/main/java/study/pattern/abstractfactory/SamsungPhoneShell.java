package study.pattern.abstractfactory;

/**
 * 三星手机壳
 */
public class SamsungPhoneShell implements PhoneShellProduct {

    public SamsungPhoneShell() {
        System.out.println("生产了一个三星手机壳...");
    }

    @Override
    public void getPrice() {
        System.out.println("三星手机壳 47 元");
    }

}
