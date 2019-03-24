package study.pattern.observer.wechat;

import study.pattern.observer.Observer;

/**
 * 微信用户
 * 这里指观察微信公众号发布消息的观察者
 */
public class WeChatUser implements Observer {

    private String name;
    private String message;

    public WeChatUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        readMessage();
    }

    public void readMessage() {
        System.out.println(name + "收到订阅通知：" + message);
    }

}
