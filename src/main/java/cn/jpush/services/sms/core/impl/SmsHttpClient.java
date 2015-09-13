package cn.jpush.services.sms.core.impl;

import cn.jpush.services.sms.core.SmsClient;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by rocyuan on 2015/9/3.
 */
@Service
public class SmsHttpClient implements SmsClient {

    @Override
    public boolean send(String phone, String content) {

        return true;
    }

    @Override
    public boolean send(String phone, String content, boolean reSend) {

        return reSend;
    }

    @Override
    public boolean sendAtTime(String phone, String content, Date sendTime) {

        return true;
    }

    @Override
    public boolean sendAsync(String phone, String content) {

        return true;
    }

    @Override
    public boolean send(String[] phone, String content) {

        return true;
    }

    @Override
    public boolean send(String[] phone, String content, boolean reSend) {

        return true;
    }

    @Override
    public boolean sendAtTime(String[] phone, String content, Date sendTime) {

        return true;
    }
}
