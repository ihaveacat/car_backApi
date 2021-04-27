package com.zs.car.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zs.car.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    SysUser findUserById(Long id);
}
