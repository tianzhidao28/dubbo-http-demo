package cn.jpush.services.sms.impl;

import cn.jpush.services.sms.SmsService;
import cn.jpush.services.sms.core.SmsClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by rocyuan on 2015/9/3.
 */
//@Service(version="1.0")

@Service
public class SmsServiceImpl implements SmsService {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("smsHttpClient")
    private SmsClient smsClient;
    @Override
    public void send(String phone, String content) {
        log.info("call SmsService.send({},{})",phone,content);
        smsClient.send(phone,content);
    }

    @Override
    public void send(String phone, String content, boolean reSend) {
        smsClient.send(phone, content ,reSend);
    }

    @Override
    public void sendAsync(String phone, String content) {
        smsClient.sendAsync(phone ,content);
    }

    @Override
    public void sendAtTime(String phone, String content, Date sendTime) {
        smsClient.sendAtTime(phone, content, sendTime);
    }

    @Override
    public void send(String[] phone, String content) {
        smsClient.send(phone ,content);
    }

    @Override
    public void send(String[] phone, String content, boolean reSend) {
        smsClient.send(phone ,content, reSend);
    }

    @Override
    public void sendAsync(String[] phone, String content) {
        smsClient.send(phone, content);
    }

    @Override
    public void sendAtTime(String[] phone, String content, Date sendTime) {
        smsClient.sendAtTime(phone, content, sendTime);
    }

    public void setSmsClient(SmsClient smsClient) {
        this.smsClient = smsClient;
    }
}
