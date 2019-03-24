package study.pattern.singleton;

/**
 * @author phil
 * 懒汉式——无锁，线程不安全
 * 优点:
 *     由于懒汉式延时加载特性，使用该实例时才实例化，节省了内存资源
 *
 * 缺点:
 *     (1) 该种实现方式存在线程不安全问题
 *     (2) 反序列化，反射与克隆可破坏单例
 */
public class LazySingletonWithoutSync {

    /** 私有化类构造器 */
    private LazySingletonWithoutSync() {}

    /** 定义静态私有类对象 */
    private static LazySingletonWithoutSync instance;

    /** 提供公共静态的获取该私有类对象的方法 */
    public static LazySingletonWithoutSync getInstance() {
        if (instance == null) {
            instance = new LazySingletonWithoutSync();
        }

        return instance;
    }

}
