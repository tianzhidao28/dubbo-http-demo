package cn.jpush.services.sms.rest.wsrs.extension;

import cn.jpush.services.sms.rest.exception.BaseException;
import com.alibaba.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import static javax.ws.rs.core.Response.*;

/**
 * Created by rocyuan on 2015/9/13.
 */
//@Provider
public class RestExceptionHandler implements ExceptionMapper<BaseException>{
    private Logger log = LoggerFactory.getLogger(this.getClass());


    @Override
    public Response toResponse(BaseException exception) {
        String ip = RpcContext.getContext().getRemoteAddressString();
        log.error("api error :ip={},result={} ",ip,exception.toJson());
        return status(exception.getHttpStatus()).entity(exception.getResponseResult()).type(MediaType.APPLICATION_JSON).build();
    }
}
