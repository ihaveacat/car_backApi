package com.zs.car.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zs.car.common.BaseEntity;

@TableName("car_info")
public class Car extends BaseEntity {

    private Long userId;

    private String carName;

    private String carColor;

    private String carNum;

    private Integer fullSeat;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public Integer getFullSeat() {
        return fullSeat;
    }

    public void setFullSeat(Integer fullSeat) {
        this.fullSeat = fullSeat;
    }

    @Override
    public String toString() {
        return "Car{" +
                "userId=" + userId +
                ", carName='" + carName + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carNum='" + carNum + '\'' +
                ", fullSeat=" + fullSeat +
                '}';
    }
}
