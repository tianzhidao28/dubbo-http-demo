package cn.jpush.services.sms;

import java.util.Date;

/**
 * Created by rocyuan on 2015/9/3.
 */
public interface SmsService {
    /**
     * @param phone
     * @param content
     */
    void send(String phone, String content);

    /**
     *
     * @param phone
     * @param content
     * @param reSend
     */
    void send(String phone, String content ,boolean reSend);

    /**
     *
     * @param phone
     * @param content
     */
    void sendAsync(String phone, String content);

    /**
     *
     * @param phone
     * @param content
     * @param sendTime
     */
    void sendAtTime(String phone, String content ,Date sendTime);


    void send(String phone[], String content);
    void send(String phone[], String content ,boolean reSend);
    void sendAsync(String phone[], String content);
    void sendAtTime(String phone[], String content ,Date sendTime);
}
