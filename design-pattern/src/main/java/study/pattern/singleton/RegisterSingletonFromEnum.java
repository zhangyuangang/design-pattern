package study.pattern.singleton;

/**
 * @author phil
 * 注册登记式——枚举单例
 */
public class RegisterSingletonFromEnum {

    /** 私有化类构造器 */
    private RegisterSingletonFromEnum() {}

    /** 使用 enum 实例特性创建 RegisterSingletonFromEnum 类对象 */
    private enum Singleton {
        INSTANCE;

        private RegisterSingletonFromEnum instance;

        // JVM保证此方法只调用一次
        Singleton() {
            instance = new RegisterSingletonFromEnum();
        }

        public RegisterSingletonFromEnum getInstance() {
            return instance;
        }
    }

    /** 提供公共静态的获取该私有类对象的方法 */
    public static RegisterSingletonFromEnum getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

}
