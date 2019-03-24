package study.pattern.abstractfactory;

/**
 * 苹果手机主体
 */
public class SamsungPhoneBody implements PhoneBodyProduct {

    public SamsungPhoneBody() {
        System.out.println("生产了一部三星手机...");
    }

    @Override
    public void getPrice() {
        System.out.println("三星手机 7500 元");
    }

}
