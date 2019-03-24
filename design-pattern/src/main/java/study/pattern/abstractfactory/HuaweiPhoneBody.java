package study.pattern.abstractfactory;

/**
 * 华为手机主体
 */
public class HuaweiPhoneBody implements PhoneBodyProduct {

    public HuaweiPhoneBody() {
        System.out.println("生产了一部华为手机...");
    }

    @Override
    public void getPrice() {
        System.out.println("华为手机 2500 元");
    }

}
