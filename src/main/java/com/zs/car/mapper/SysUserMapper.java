package com.zs.car.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zs.car.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    SysUser login(String username, String password);

    /**
     * 用户注册
     * @param su
     * @return
     */
    int userRegistration(SysUser su);
}
