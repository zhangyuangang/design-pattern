package study.pattern.abstractfactory;

/**
 * 华为手机工厂，负责生产华为一系列产品
 * 本例中，生产华为手机主体和华为手机壳
 */
public class HuaweiPhoneFactory implements PhoneFactory {

    @Override
    public PhoneBodyProduct createPhoneBody() {
        return new HuaweiPhoneBody();
    }

    @Override
    public PhoneShellProduct createPhoneShell() {
        return new HuaweiPhoneShell();
    }

}
