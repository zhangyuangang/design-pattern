package study.pattern.strategy;

/**
 * 支付策略
 */
public abstract class BasePayStrategy {

    /**
     * @param payAmount 支付金额
     * @param paymentName 支付方式
     */
    abstract void pay(double payAmount, String paymentName);
}
