package cn.jpush.services.sms;

import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by rocyuan on 2015/9/8.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-consumer.xml"})
public class SmsServiceTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    SmsService smsService;

    @Test
    public void smsServiceTest1(){
        System.out.println("Test begin : ");
        smsService.send("15507587404","test_test");
        System.out.println("Test end :");
    }
}
