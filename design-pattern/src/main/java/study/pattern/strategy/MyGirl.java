package study.pattern.strategy;

/**
 * 女朋友：支付主体，这里为支付策略的上下文
 */
public class MyGirl {

    private BasePayStrategy payment;

    public MyGirl(BasePayStrategy payment) {
        this.payment = payment;
    }

    public void pay(double payAmount, String paymentName) {
        payment.pay(payAmount, paymentName);
    }
}
