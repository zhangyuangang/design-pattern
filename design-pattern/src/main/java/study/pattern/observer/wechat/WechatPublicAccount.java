package study.pattern.observer.wechat;

import study.pattern.observer.Observer;
import study.pattern.observer.Observerable;

import java.util.ArrayList;
import java.util.List;

/**
 * 微信公众号
 * 这里指被微信用户观察的对象
 */
public class WechatPublicAccount implements Observerable {

    private String accountName;
    private List<Observer> observerList;
    private String message;

    public WechatPublicAccount(String accountName) {
        this.accountName = accountName;
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!observerList.isEmpty()) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        if (observerList.isEmpty()) {
            return;
        }

        for (Observer observer : observerList) {
            observer.update(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;

        System.out.println("“" + accountName + "”" + "微信公众号更新消息：" + message);

        // 通知所有观察者
        notifyObserver();
    }
}
