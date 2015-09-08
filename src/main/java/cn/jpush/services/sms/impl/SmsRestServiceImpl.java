package cn.jpush.services.sms.impl;

import cn.jpush.services.sms.SmsService;

import java.util.Date;

/**
 * Created by rocyuan on 2015/9/9.
 */

public class SmsRestServiceImpl implements SmsService {
    /**
     * @param phone
     * @param content
     */
    @Override
    public void send(String phone, String content) {

    }

    /**
     * @param phone
     * @param content
     * @param reSend
     */
    @Override
    public void send(String phone, String content, boolean reSend) {

    }

    /**
     * @param phone
     * @param content
     */
    @Override
    public void sendAsync(String phone, String content) {

    }

    /**
     * @param phone
     * @param content
     * @param sendTime
     */
    @Override
    public void sendAtTime(String phone, String content, Date sendTime) {

    }

    @Override
    public void send(String[] phone, String content) {

    }

    @Override
    public void send(String[] phone, String content, boolean reSend) {

    }

    @Override
    public void sendAsync(String[] phone, String content) {

    }

    @Override
    public void sendAtTime(String[] phone, String content, Date sendTime) {

    }
}
