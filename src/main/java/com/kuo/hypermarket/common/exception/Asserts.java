package com.kuo.hypermarket.common.exception;

import com.kuo.hypermarket.common.api.ErrorCode;

/**
 * @author wangfangfang
 * @Title: Asserts
 * @Description:
 * @date 2020/4/2611:31 下午
 * @since 1.8
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(ErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}