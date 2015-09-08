package cn.jpush.services.sms.impl;

import cn.jpush.services.sms.SmsService;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Date;

/**
 * Created by rocyuan on 2015/9/9.
 */
@Path("sms")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class SmsRestServiceImpl implements SmsService {
    /**
     * @param phone
     * @param content
     */
    @Override
    @GET
    @Path("send")
    public void send(@FormParam("phone")String phone, @FormParam("content")String content) {

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
