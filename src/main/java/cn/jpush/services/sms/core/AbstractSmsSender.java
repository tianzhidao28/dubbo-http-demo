package cn.jpush.services.sms.core;

import cn.jpush.services.sms.SmsService;
import cn.jpush.services.sms.bean.Sms;
import cn.jpush.services.sms.dao.SmsDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by rocyuan on 2015/9/13.
 */
public abstract class AbstractSmsSender{

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SmsDao smsDao;
    /**
     * 检测短信的IP是否是黑名单和号码是否合法,黑名单
     * @return true if valid else throws exception
     */
    private boolean checkSms(Sms sms){
        return true;
    }

    /**
     * 持久化到数据库
     * @param sms
     */
    private void persistence(Sms sms){
        smsDao.insert(sms);
        log.info("sms send {} -> {}: ",sms.getPhone(),sms.getContent());
    }
    public boolean sendSms(Sms sms) {
        return true;
    }


}
