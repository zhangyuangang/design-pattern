package study.pattern.strategy;

import org.junit.Test;

public class BasePayStrategyTest {

    @Test
    public void paymentTest() {
        MyGirl myGirl = new MyGirl(new AliPay());
        System.out.println("女朋友想买书");
        myGirl.pay(100, PaymentEnum.ALI_PAY.getPaymentName());

        myGirl = new MyGirl(new WeChatPay());
        System.out.println("女朋友给爸妈发红包");
        myGirl.pay(888, PaymentEnum.WECHAT_PAY.getPaymentName());

        myGirl = new MyGirl(new CashPay());
        System.out.println("女朋友在路边买了串羊肉串");
        myGirl.pay(8, PaymentEnum.CASH_PAY.getPaymentName());
    }

}