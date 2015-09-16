
package cn.jpush.services.sms.rest;


/**
 * 
 * @author yuanzp@jpush.cn
 * @date 2015-6-30
 * @desc APICode系统错误和信息码
 */
public enum APICode {
	
	
	OK(200,0,"success","默认的成功结果"),
	FAIL(500,5002,"fail","默认的失败结果"),

    // 系统错误
    SERVER_ERROR(500, 5000, "Bad server"),
    BUSINESS_ERROR(500, 5001, "Business error"),


    // 鉴权错误
    AUTHORIZATION_FAIL(401, 4100, "Authorization fail", "鉴权失败"),
    SIGNATURE_ERROR(401, 4101, "Invalid signature", "无效的签名"),
    APPKEY_ERROR(401, 4102, "Invalid appkey", "无效的AppKey"),
    USER_AGENT_ERROR(401, 4103, "Invalid Client", "无效的客户端发起的请求"),


   
    /**
    * 参数不规范
    */
    PARAMETER_ERROR(400, 4006, "Parameter invalid"),


    HTTP_ERROR(400, 4004, " Http error , inalid ,check the head or url "),
    OBJECT_NOT_FOUND(400, 4005," No object find  " ,"找不到对象 ,检查参数") ,
    NULLPOINT(400, 4006,"Parameter value is wrong , create an nullpoint exeception");






    private int httpCode;
    private int code;
    private String message;
    private String comment;


    APICode(int httpCode, int code, String message) {
    this.httpCode = httpCode;
    this.code = code;
    this.message = message;
    }

    APICode(int httpCode, Integer code, String message, String comment) {
    this.httpCode = httpCode;
    this.code = code;
    this.message = message;
    this.comment = comment ;
    }

    public int getHttpCode() {
    return httpCode;
    }

    public int getCode() {
    return code;
    }

    public String getMessage() {
    return message;
    }

    public String getComment() {
    return comment;
    }

    public String toJson() {
    return String.format("{\"code\":%d,\"message\":\"%s\"}", code, message);
    }


    @Override
    public String toString() {
    return String.format("[httpCode:%s, code:%s, message:%s, comment:%s]", httpCode, code, message, comment);
    }


}

