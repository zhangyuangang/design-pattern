package study.pattern.observer;

/**
 * 抽象观察者接口，具体的观察者需事先该接口
 */
public interface Observer {

    void update(String message);
}
