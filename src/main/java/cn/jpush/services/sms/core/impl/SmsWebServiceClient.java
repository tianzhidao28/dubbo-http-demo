package cn.jpush.services.sms.core.impl;

import cn.jpush.services.sms.core.SmsClient;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 使用WebService实现的请求方法
 * Created by rocyuan on 2015/9/3.
 */
@Service
public class SmsWebServiceClient implements SmsClient {

    @Override
    public void send(String phone, String content) {
        
    }

    @Override
    public void send(String phone, String content, boolean reSend) {

    }

    @Override
    public void sendAtTime(String phone, String content, Date sendTime) {

    }

    @Override
    public void sendAsync(String phone, String content) {

    }

    @Override
    public void send(String[] phone, String content) {

    }

    @Override
    public void send(String[] phone, String content, boolean reSend) {

    }

    @Override
    public void sendAtTime(String[] phone, String content, Date sendTime) {

    }
}
