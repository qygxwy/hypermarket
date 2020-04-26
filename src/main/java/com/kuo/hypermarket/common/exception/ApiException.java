package com.kuo.hypermarket.common.exception;

import com.kuo.hypermarket.common.api.ErrorCode;

/**
 * @author wangfangfang
 * @Title: ApiException
 * @Description: 自定义API异常
 * @date 2020/4/2611:32 下午
 * @since 1.8
 */
public class ApiException extends RuntimeException {
    private ErrorCode errorCode;

    public ApiException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}