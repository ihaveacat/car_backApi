package com.zs.car.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zs.car.entity.Car;

import java.util.List;

public interface CarService extends IService<Car> {

    List<Car> findCarByUserId(Long userId);

    void saveCar(Car car);
}
