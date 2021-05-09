package com.zs.car.common;

import com.zs.car.common.utils.ResultCodeEnum;

/**
 * 自定义异常
 */
//@EqualsAndHashCode(callSuper = true)
public class AllException extends RuntimeException{

    private Integer code;

    public AllException(String message, Integer code) {
        super(message);
        this.code = code;
    }
    public AllException(ResultCodeEnum resultCodeEnum) {
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
        return "AllException{" +
                "code=" + code +
                "message=" + this.getMessage() +
                '}';
    }
}
