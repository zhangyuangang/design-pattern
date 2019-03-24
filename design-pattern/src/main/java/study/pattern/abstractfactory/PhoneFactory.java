package study.pattern.abstractfactory;

/**
 * 抽象手机工厂
 */
public interface PhoneFactory {

    /**
     * 创建手机主体
     */
    PhoneBodyProduct createPhoneBody();

    /**
     * 创建手机壳
     */
    PhoneShellProduct createPhoneShell();

}
