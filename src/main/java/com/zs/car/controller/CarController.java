package com.zs.car.controller;

import com.zs.car.common.AllException;
import com.zs.car.common.utils.R;
import com.zs.car.common.utils.ResultCodeEnum;
import com.zs.car.entity.Car;
import com.zs.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

/**
 * 车辆信息
 */
@CrossOrigin
@RestController
@RequestMapping("car")
public class CarController {

    @Autowired
    private CarService carService;

    /**
     * 根据用户id查询车辆
     * @param userId
     * @return
     */
    @RequestMapping("findCarByUserId")
    public R findCarByUserId(@RequestParam("userId") Long userId) {
        if (userId == null) {
            throw new AllException(ResultCodeEnum.PARAM_ERROR);
        }
        List<Car> cars = carService.findCarByUserId(userId);
        return R.ok().data("data", cars);
    }

    @RequestMapping("saveCar")
    public R saveCar(@RequestBody Car car) {
        if (car == null) {
            throw new AllException(ResultCodeEnum.PARAM_ERROR);
        }
        carService.saveCar(car);
        return R.ok().message("保存成功");
    }
}
