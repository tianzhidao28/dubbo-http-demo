package cn.jpush.services.sms.bean;

import cn.jpush.services.sms.util.Identities;

import java.util.Date;

/**
 * 短信实体类
 * Created by rocyuan on 2015/9/3.
 */
public class Sms {
    // 短信ID
    private String id;
    // 创建时间
    private Date createTime;
    // 短信内容
    private String content;
    // 短信分类  默认0
    private Integer type;
    // 发送时间或者预定的发送时间
    private Date sendTime;
    // -1失败 0发送 1发送成功
    private Integer sendStatus;
    // 是否失败重发
    private boolean reSend;
    // 附加参数;预留用途
    private String extra;
    // 发送客户端的IP地址
    private String clientIP;

    private Sms(Builder builder){
        this.id = builder.id;
        this.content = builder.content;
        this.createTime = builder.createTime;
        this.type = builder.type;
        this.sendTime = builder.sendTime;
        this.sendStatus = builder.sendStatus;
        this.reSend = builder.reSend;
        this.extra =  builder.extra;
        this.clientIP= builder.clientIP;

    }

    public static class Builder {
        private String id;
        private Date createTime;
        private String content;
        private Integer type;
        private Date sendTime;
        private Integer sendStatus;
        private boolean reSend;
        private String extra;
        private String clientIP;

        public Builder(String content){
            Date now = new Date();
            this.id = Identities.idByTimer();
            this.createTime = now;
            this.sendTime = now;
            this.content = content;
            this.type = 0;
            this.sendStatus = 0;
            this.reSend = false;
        }

        public Builder(String id, String content, Integer type){
            Date now = new Date();
            this.id = id;
            this.createTime = now;
            this.sendTime = now;
            this.content = content;
            this.type = type;
            this.sendStatus = 0;
            this.reSend = false;
        }
        public Builder setId(String id) {
            this.id = id;
            return this;
        }


        public Builder setType(Integer type) {
            this.type = type;
            return this;
        }

        public Builder setClientIP(String clientIP){
            this.clientIP = clientIP;
            return this;
        }
        public Builder setSendTime(Date sendTime) {
            this.sendTime = sendTime;
            return this;
        }

        public Builder setReSend(boolean reSend) {
            this.reSend = reSend;
            return this;
        }

        public Builder setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public Sms build() {
            return new Sms(this);
        }
    }
}
