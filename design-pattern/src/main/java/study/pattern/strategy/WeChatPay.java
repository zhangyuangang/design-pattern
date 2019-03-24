package study.pattern.strategy;

public class WeChatPay extends BasePayStrategy {

    @Override
    void pay(double payAmount, String paymentName) {
        System.out.println("正在使用微信钱包...");
        System.out.println("使用" + paymentName + "付款" + payAmount + "元");
    }

}
