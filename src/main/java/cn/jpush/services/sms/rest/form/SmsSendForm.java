package cn.jpush.services.sms.rest.form;

import org.hibernate.validator.constraints.NotBlank;

import java.util.Date;

/**
 * Created by rocyuan on 2015/9/13.
 */
public class SmsSendForm {
    @NotBlank
    public String phone;
    @NotBlank
    public String content;

    public Date sendTime;
    public boolean reSend;


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public boolean isReSend() {
        return reSend;
    }

    public void setReSend(boolean reSend) {
        this.reSend = reSend;
    }
}
