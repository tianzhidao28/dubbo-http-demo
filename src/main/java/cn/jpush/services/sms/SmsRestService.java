package cn.jpush.services.sms;

import cn.jpush.services.sms.rest.APIResult;
import cn.jpush.services.sms.rest.form.SmsSendForm;

import java.util.Date;

/**
 * Created by rocyuan on 2015/9/12.
 */
public interface SmsRestService {

    /**
     * @param phone
     * @param content
     */
    APIResult send(String phone, String content);

    APIResult send(SmsSendForm form);

}
