package com.zs.car.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zs.car.entity.Car;
import com.zs.car.mapper.CarMapper;
import com.zs.car.service.CarService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CarServiceImpl extends ServiceImpl<CarMapper, Car> implements CarService {

    @Override
    public List<Car> findCarByUserId(Long userId) {
        QueryWrapper<Car> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", userId);
        List<Car> cars = baseMapper.selectList(queryWrapper);
        return cars;
    }

    @Override
    public void saveCar(Car car) {
        baseMapper.insert(car);
    }
}
