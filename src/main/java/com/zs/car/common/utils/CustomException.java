package com.zs.car.common.utils;

/**
 * 自定义运行时异常
 */
public class CustomException extends RuntimeException{

    private Integer code;

    public CustomException(){}

    public CustomException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public CustomException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "CustomException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }
}
