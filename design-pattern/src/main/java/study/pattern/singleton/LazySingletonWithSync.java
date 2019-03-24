package study.pattern.singleton;

/**
 * @author phil
 * 懒汉式
 * 优点:
 *     (1) 由于懒汉式延时加载特性，使用该实例时才实例化，节省了内存资源
 *     (2) 线程安全
 * 缺点:
 *     (1) 给获取实例的公共方法加上同步锁synchronized，性能受到影响
 *     (2) 反序列化，反射与克隆可破坏单例
 */
public class LazySingletonWithSync {

    /** 私有化类构造器 */
    private LazySingletonWithSync() {}

    /** 定义静态私有类对象 */
    private static LazySingletonWithSync instance;

    /** 提供公共静态的获取该私有类对象的方法 */
    public static synchronized LazySingletonWithSync getInstance() {
        if (instance == null) {
            instance = new LazySingletonWithSync();
        }

        return instance;
    }

}
