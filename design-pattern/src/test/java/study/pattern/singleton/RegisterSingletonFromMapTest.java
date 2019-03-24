package study.pattern.singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * @author phil
 * {@link RegisterSingletonFromMap} Test
 */
@Slf4j
public class RegisterSingletonFromMapTest {

    private static final int CONCURRENT_THREAD_NUMBER = 200;

    @Test
    public void concurrentGetSingletonWithCyclicBarrierTest() throws Exception {
        final CyclicBarrier barrier = new CyclicBarrier(CONCURRENT_THREAD_NUMBER);
        final CountDownLatch latch = new CountDownLatch(CONCURRENT_THREAD_NUMBER);

        // 统计并发获取到的单例对象引用地址，用于验证获取到的单例是否是同一个
        final List<String> instanceUrl = new Vector<String>();

        for (int i = 0; i < CONCURRENT_THREAD_NUMBER; i++) {
            new Thread(() -> {
                try {
                    barrier.await();

                    RegisterSingletonFromMap instance = RegisterSingletonFromMap.getInstance();

                    log.debug("当前时间: {}, 单例: {}", System.currentTimeMillis(), instance.toString());

                    instanceUrl.add(instance.toString());

                    latch.countDown();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }

        latch.await();

        log.debug("模拟并发线程数：{}, 实际并发线程数：{}", CONCURRENT_THREAD_NUMBER, instanceUrl.size());
        Assert.assertEquals("线程数：" + CONCURRENT_THREAD_NUMBER, "线程数：" + instanceUrl.size());

        // 验证并发获取到的单例是否是同一个实例
        this.verifySingletonsIsSameOrNotWithAssert(instanceUrl);
    }

    @Test
    public void concurrentGetSingletonWithCountDownLatchTest() throws Exception {
        final CountDownLatch workThreadLatch = new CountDownLatch(CONCURRENT_THREAD_NUMBER);
        final CountDownLatch mainThreadLatch = new CountDownLatch(CONCURRENT_THREAD_NUMBER);

        // 统计并发获取到的单例对象引用地址，用于验证获取到的单例是否是同一个
        final List<String> instanceUrl = new Vector<String>();

        for (int i = 0; i < CONCURRENT_THREAD_NUMBER; i++) {
            new Thread(() -> {
                try {
                    workThreadLatch.await();

                    RegisterSingletonFromMap instance = RegisterSingletonFromMap.getInstance();

                    log.debug("当前时间: {}, 单例: {}", System.currentTimeMillis(), instance.toString());

                    instanceUrl.add(instance.toString());

                    mainThreadLatch.countDown();
                } catch (Exception e) {
                    log.error("线程 {} 异常: {}", Thread.currentThread().getName(), e);
                }
            }).start();

            workThreadLatch.countDown();
        }

        mainThreadLatch.await();

        log.debug("模拟并发线程数：{}, 实际并发线程数：{}", CONCURRENT_THREAD_NUMBER, instanceUrl.size());
        Assert.assertEquals("线程数：" + CONCURRENT_THREAD_NUMBER, "线程数：" + instanceUrl.size());

        // 验证并发获取到的单例是否是同一个实例
        this.verifySingletonsIsSameOrNotWithAssert(instanceUrl);
    }

    @Test
    public void breakSingletonByReflectionTest() throws Exception {
        RegisterSingletonFromMap singleton = RegisterSingletonFromMap.getInstance();

        Constructor<RegisterSingletonFromMap> constructor = RegisterSingletonFromMap.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        RegisterSingletonFromMap singletonFromReflection = constructor.newInstance();

        log.debug("正常单例：{}", singleton.toString());
        log.debug("反射单例：{}", singletonFromReflection.toString());

        Assert.assertNotEquals(singleton.toString(), singletonFromReflection.toString());
    }

    /**
     * 验证并发获取到的单例是否是同一个实例
     */
    private void verifySingletonsIsSameOrNotWithAssert(final List<String> instanceUrl) {
        for (int i = 0; i < instanceUrl.size(); i++) {
            if (i == instanceUrl.size() - 1) {
                Assert.assertEquals(instanceUrl.get(i - 1), instanceUrl.get(i));
                break;
            }

            Assert.assertEquals(instanceUrl.get(i), instanceUrl.get(i + 1));
        }
    }

}