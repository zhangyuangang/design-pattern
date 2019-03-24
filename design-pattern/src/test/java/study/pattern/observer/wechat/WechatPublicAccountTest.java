package study.pattern.observer.wechat;

import org.junit.Test;

public class WechatPublicAccountTest {

    @Test
    public void wechatObserverUpdateTest() {
        WechatPublicAccount wechatPublicAccount = new WechatPublicAccount("连岳");

        WeChatUser zhangSan = new WeChatUser("张三");
        WeChatUser liSi = new WeChatUser("李四");
        WeChatUser wangWu = new WeChatUser("王五");

        wechatPublicAccount.addObserver(zhangSan);
        wechatPublicAccount.addObserver(liSi);
        wechatPublicAccount.addObserver(wangWu);
        wechatPublicAccount.setMessage("《自信是命运的命令，必须遵守》");

        System.out.println();
        System.out.println("----------------张三 取消订阅名为“连岳”的微信公众号----------------");
        System.out.println();

        wechatPublicAccount.removeObserver(zhangSan);
        wechatPublicAccount.setMessage("《强者的行为模式：为改变而改变》");
    }

}