package study.pattern.strategy;

public class AliPay extends BasePayStrategy {

    @Override
    void pay(double payAmount, String paymentName) {
        System.out.println("正在使用支付宝...");
        System.out.println("使用" + paymentName + "付款" + payAmount + "元");
    }

}
