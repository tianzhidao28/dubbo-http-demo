package cn.jpush.services.sms.rest.exception;


import cn.jpush.services.sms.rest.APICode;
import cn.jpush.services.sms.rest.APIResult;

public class BaseException extends RuntimeException {
	private APICode errorCode;

	public BaseException(APICode errorCode) {
		super(errorCode.toString());
		this.errorCode = errorCode;
	}

	public BaseException(String message, APICode errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public BaseException(String message, APICode errorCode, Throwable exception) {
		super(message, exception);
		this.errorCode = errorCode;
	}

	public int getHttpStatus() {
		return this.errorCode.getHttpCode();
	}

	public String toJson() {
		return errorCode.toJson();
	}
	public APIResult getResponseResult() {
		return APIResult.newBuilder(errorCode).build();
	}

}
