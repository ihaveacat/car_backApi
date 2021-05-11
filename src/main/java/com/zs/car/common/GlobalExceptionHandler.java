package com.zs.car.common;

import com.zs.car.common.utils.ExceptionUtils;
import com.zs.car.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 顶级异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e) {
        log.error(ExceptionUtils.getMessage(e));
        return R.error();

    }


    /**
     * 自定义异常
     * @param e
     * @return
     */
    @ExceptionHandler(AllException.class)
    @ResponseBody
    public R error(AllException e) {
        log.error(ExceptionUtils.getMessage(e));
        return R.error().message(e.getMessage()).code(e.getCode());
    }

    /**
     * 定向异常（弃用）
     * @param e
     * @return
     */
//    @ExceptionHandler(CustomException.class)
//    @ResponseBody
//    public R error(CustomException e) {
//        e.printStackTrace();
//        return R.setResult(ResultCodeEnum.REGISTER_MOBLE_ERROR);
//    }
}
