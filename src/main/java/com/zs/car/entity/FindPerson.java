package com.zs.car.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zs.car.common.BaseEntity;

import java.util.Date;

@TableName("find_person_info")
public class FindPerson extends BaseEntity {

    private Long userId;

    private String startPoint;

    private String theWay;

    private String endPoint;

    private Date startTime;

    //sys_user表字段
    private String username;
    private String tel;
    //car_info车辆表字段
    private String carColor;
    private String carNum;
    private Integer fullSeat;

    //get&set方法
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getTheWay() {
        return theWay;
    }

    public void setTheWay(String theWay) {
        this.theWay = theWay;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    //sys_user表字段方法
    public String getUsername() {
        return username;
    }

    public String getTel() {
        return tel;
    }
    //car_info车辆表字段方法


    public String getCarColor() {
        return carColor;
    }

    public String getCarNum() {
        return carNum;
    }

    public Integer getFullSeat() {
        return fullSeat;
    }

    @Override
    public String toString() {
        return "FindPerson{" +
                "userId=" + userId +
                ", startPoint='" + startPoint + '\'' +
                ", theWay='" + theWay + '\'' +
                ", endPoint='" + endPoint + '\'' +
                ", startTime=" + startTime +
                ", id=" + super.getId() +
                '}';
    }
}
