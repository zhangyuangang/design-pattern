package study.pattern.observer;

/**
 * 抽象被观察者接口，被观察对象需实现该接口
 */
public interface Observerable {

    /**
     * 添加观察者
     */
    void addObserver(Observer observer);

    /**
     * 删除观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver();
}
