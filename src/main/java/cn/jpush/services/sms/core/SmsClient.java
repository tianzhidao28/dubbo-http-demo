package cn.jpush.services.sms.core;

import cn.jpush.services.sms.SmsService;

import java.util.Date;

/**
 * Created by rocyuan on 2015/9/3.
 */
public interface SmsClient {

    boolean send(String phone, String content);

    boolean send(String phone, String content, boolean reSend);

    boolean sendAtTime(String phone, String content, Date sendTime);

    boolean sendAsync(String phone, String content);

    boolean send(String phone[], String content);

    boolean send(String phone[], String content, boolean reSend);

    boolean sendAtTime(String phone[], String content, Date sendTime);


}
