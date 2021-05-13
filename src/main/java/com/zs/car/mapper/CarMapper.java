package com.zs.car.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zs.car.entity.Car;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarMapper extends BaseMapper<Car> {

    List<Car> findCarByUserId(Long id);
}
