package cn.jpush.services.sms.consumer;

import cn.jpush.services.sms.SmsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

/**
 * @author Jerry Lee
 */
public class ConsumerMain {
    public static void main(String[] args) throws InterruptedException {
        String applicationXMLPath = "spring-consumer.xml";
        if(args !=null) {
            applicationXMLPath = args[0];
        }
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:"+applicationXMLPath);
        classPathXmlApplicationContext.start();

        SmsService smsService = classPathXmlApplicationContext.getBean("smsService",SmsService.class);
        System.out.println("================  "+applicationXMLPath +" consumer  start  ==================");

        for(int i=0 ; i < 10000 ; ++i) {
            int random = new Random().nextInt(10);
            Thread.sleep(random*1000);
            i = i + random;
            smsService.send(applicationXMLPath+ " : 13349932163","text");
            System.out.println("================  "+applicationXMLPath +" execute"+ i+"  ==================");
        }
        System.out.println("================  "+applicationXMLPath +" consumer  end  ==================");


    }
}
