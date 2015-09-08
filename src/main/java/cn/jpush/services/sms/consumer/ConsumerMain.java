package cn.jpush.services.sms.consumer;

import cn.jpush.services.sms.SmsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jerry Lee
 */
public class ConsumerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-consumer.xml");
        classPathXmlApplicationContext.start();

        SmsService smsService = classPathXmlApplicationContext.getBean("smsService",SmsService.class);

        smsService.send("13349932163","text");

        System.out.println("=====================================");
        System.out.println("=====================================");
    }
}
