package cn.jpush.services.sms.consumer;

import cn.jpush.services.sms.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jerry Lee
 */
public class ConsumerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-consumer.xml");
        classPathXmlApplicationContext.start();

        HelloService helloService = (HelloService) classPathXmlApplicationContext.getBean("helloService");
        String world = helloService.hello("World");

        System.out.println("=====================================");
        System.out.println(world);
        System.out.println("=====================================");
    }
}
