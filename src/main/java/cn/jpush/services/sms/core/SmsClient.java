package cn.jpush.services.sms.core;

import cn.jpush.services.sms.SmsService;

import java.util.Date;

/**
 * Created by rocyuan on 2015/9/3.
 */
public interface SmsClient {

    void send(String phone, String content);

    void send(String phone, String content, boolean reSend);

    void sendAtTime(String phone, String content, Date sendTime);

    void sendAsync(String phone, String content);

    void send(String phone[], String content);

    void send(String phone[], String content, boolean reSend);

    void sendAtTime(String phone[], String content, Date sendTime);


}
