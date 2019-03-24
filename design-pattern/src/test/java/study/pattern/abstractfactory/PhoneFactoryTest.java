package study.pattern.abstractfactory;

import org.junit.Test;

public class PhoneFactoryTest {

    @Test
    public void abstractPhoneFacoryTest() {
        PhoneFactory huaweiPhoneFactory = new HuaweiPhoneFactory();
        PhoneBodyProduct huaweiPhoneBody = huaweiPhoneFactory.createPhoneBody();
        huaweiPhoneBody.getPrice();
        PhoneShellProduct huaweiPhoneShell = huaweiPhoneFactory.createPhoneShell();
        huaweiPhoneShell.getPrice();

        System.out.println("----------------------------------");

        PhoneFactory samsungPhoneFactory = new SamsungPhoneFactory();
        PhoneBodyProduct samsungPhoneBody = samsungPhoneFactory.createPhoneBody();
        samsungPhoneBody.getPrice();
        PhoneShellProduct samsungPhoneShell = samsungPhoneFactory.createPhoneShell();
        samsungPhoneShell.getPrice();
    }

}