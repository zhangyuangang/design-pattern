package study.pattern.strategy;

/**
 * 支付方式枚举类
 */
public enum PaymentEnum {

    ALI_PAY(1, "支付宝"), WECHAT_PAY(2, "微信钱包"), CASH_PAY(3, "现金");

    private int value;
    private String paymentName;

    PaymentEnum(int value, String paymentName) {
        this.value = value;
        this.paymentName = paymentName;
    }

    public int getValue() {
        return value;
    }

    public String getPaymentName() {
        return paymentName;
    }

}
