package study.pattern.singleton;

/**
 * @author phil
 * 懒汉式——双重锁检查单例
 * 优点:
 *     (1) 由于懒汉式延时加载特性，使用该实例时才实例化，节省了内存资源
 *     (2) 线程安全
 * 缺点:
 *     (1) 如果不加volatile关键词防止指令重排，双重锁检查单例可能会出现不完整实例
 *         分析：instance = new LazySingletonWithDoubleCheck() 操作并非原子操作，它包含如下三个操作指令：
 *             1) 分配对象的内存空间 memory = allocate()
 *             2) 初始化对象 ctorInstance(memory)
 *             3) 设置instance指向刚分配的内存地址 instance = memory
 *         经过指令重排序后，执行顺序可能如下：
 *             1) 分配对象的内存空间 memory = allocate()
 *             2) 设置instance指向刚分配的内存地址 instance = memory
 *             3) 初始化对象 ctorInstance(memory)
 *         若有A线程执行完上述重排序后的第二步，尚未初始化对象，此时B线程来获取单例instance，会发现instance不为空，于是返回该值，但实际该instance尚未构建完成，为不完整实例。
 *     (2) 反序列化，反射与克隆可破坏单例
 */
public class LazySingletonWithDoubleCheck {

    /** 私有化类构造器 */
    private LazySingletonWithDoubleCheck() {}

    /** 定义静态私有类对象 */
    private static volatile LazySingletonWithDoubleCheck instance;

    /** 提供公共静态的获取该私有类对象的方法 */
    public static LazySingletonWithDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (LazySingletonWithDoubleCheck.class) {
                if (instance == null) {
                    instance = new LazySingletonWithDoubleCheck();
                }
            }
        }

        return instance;
    }

}
