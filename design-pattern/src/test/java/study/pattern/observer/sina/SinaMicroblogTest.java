package study.pattern.observer.sina;

import org.junit.Test;

public class SinaMicroblogTest {

    @Test
    public void sinaMicroblogObserverUpdateTest() {
        SinaMicroblog blogger = new SinaMicroblog("中国青年网");

        SinaMicroblog zhangSan = new SinaMicroblog("张三");
        SinaMicroblog liSi = new SinaMicroblog("李四");
        SinaMicroblog wangWu = new SinaMicroblog("王五");

        blogger.addObserver(zhangSan);
        blogger.addObserver(liSi);
        blogger.addObserver(wangWu);

        blogger.setInfo("让学校教育和家庭教育...");

        System.out.println();
        System.out.println("----------------张三 取消关注 “中国青年网”----------------");
        System.out.println();

        blogger.removeObserver(zhangSan);
        blogger.setInfo("幼小的孩子...");
    }

}