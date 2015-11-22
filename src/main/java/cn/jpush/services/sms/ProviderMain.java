package cn.jpush.services.sms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jerry Lee
 */
public class ProviderMain {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-application.xml");
        classPathXmlApplicationContext.start();
        SmsService smsService = classPathXmlApplicationContext.getBean("smsService",SmsService.class);

        System.out.println("===============Service Provider Start======================");

        smsService.send("13349932163","text");

        System.out.println("================Service Provider Starting===================");
        Thread.currentThread().join();

    }
}
