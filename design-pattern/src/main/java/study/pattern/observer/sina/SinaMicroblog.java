package study.pattern.observer.sina;

import study.pattern.observer.Observer;
import study.pattern.observer.Observerable;

import java.util.ArrayList;
import java.util.List;

/**
 * 新浪微博博主
 * 这里指被微博用户观察的对象，同时又是被观察的对象
 */
public class SinaMicroblog implements Observerable, Observer {

    private String name;
    private List<Observer> list;
    private String message;

    public SinaMicroblog(String name) {
        this.name = name;
        list = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!list.isEmpty()) {
            list.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        if (list.isEmpty()) {
            return;
        }

        for (Observer o : list) {
            o.update(message);
        }
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public void setInfo(String message) {
        this.message = message;
        System.out.println(name + " 发布微博：" + message);
        notifyObserver();
    }

    public void read() {
        System.out.println(name + " 看到微博更新：" + message);
    }

}
