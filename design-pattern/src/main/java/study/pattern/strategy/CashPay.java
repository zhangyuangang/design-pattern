package study.pattern.strategy;

public class CashPay extends BasePayStrategy {

    @Override
    void pay(double payAmount, String paymentName) {
        System.out.println("正在掏出现金...");
        System.out.println("使用" + paymentName + "付款" + payAmount + "元");
    }

}
