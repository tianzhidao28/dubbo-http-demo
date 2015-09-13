package cn.jpush.services.sms.impl;

import cn.jpush.services.sms.SmsRestService;
import cn.jpush.services.sms.bean.Sms;
import cn.jpush.services.sms.core.AbstractSmsSender;
import cn.jpush.services.sms.core.SmsClient;
import cn.jpush.services.sms.rest.APICode;
import cn.jpush.services.sms.rest.APIResult;
import cn.jpush.services.sms.rest.form.SmsSendForm;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.util.Date;

/**
 * Created by rocyuan on 2015/9/9.
 */
@Path("/sms")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML,MediaType.TEXT_PLAIN})
@Produces({ContentType.APPLICATION_JSON_UTF_8})
@Service
public class SmsRestServiceImpl extends AbstractSmsSender implements SmsRestService {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("smsHttpClient")
    private SmsClient smsClient;

    @Context
    HttpServletRequest request;
    /**
     * http://127.0.0.1:8888/rest/sms/send?phone=1212&content=wewew
     * @param phone
     * @param content
     */
    @Override
    @GET
    @Path("send")
    public APIResult send(@QueryParam("phone") String phone, @QueryParam("content") String content) {
        String ip = request.getRemoteHost();
        Sms sms = new Sms.Builder(content,phone).setIP(ip).build();
        boolean success = sendSms(sms);
        if (success) {
            return APIResult.newBuilder(APICode.OK).build();
        } else {
            return APIResult.newBuilder(APICode.FAIL).build();
        }
    }

    @Override
    @POST
    @Path("send")
    public APIResult send(SmsSendForm form) {
        return null;
    }


}
