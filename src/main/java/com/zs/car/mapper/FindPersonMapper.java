package com.zs.car.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zs.car.entity.FindPerson;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FindPersonMapper extends BaseMapper<FindPerson> {

    List<FindPerson> pageFindPersonList(Integer page, Integer limit);
}
