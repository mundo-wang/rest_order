package com.suye.common;

/**
 * @author sj.w
 * 自定义业务异常
 */
public class CustomException extends RuntimeException{
    public CustomException() {
        super();
    }

    public CustomException(String message) {
        super(message);
    }
}
