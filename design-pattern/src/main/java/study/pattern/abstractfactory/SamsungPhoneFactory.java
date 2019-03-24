package study.pattern.abstractfactory;

/**
 * 三星手机工厂，负责生产三星手机系列产品
 * 本例中，生产三星手机主体和三星手机壳
 */
public class SamsungPhoneFactory implements PhoneFactory {

    @Override
    public PhoneBodyProduct createPhoneBody() {
        return new SamsungPhoneBody();
    }

    @Override
    public PhoneShellProduct createPhoneShell() {
        return new SamsungPhoneShell();
    }

}
