package com.zs.car.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zs.car.entity.FindPerson;
import com.zs.car.mapper.FindPersonMapper;
import com.zs.car.service.FindPersonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindPersonServiceImpl extends ServiceImpl<FindPersonMapper, FindPerson> implements FindPersonService {
    @Override
    public List<FindPerson> pageFindPersonList(Integer page, Integer limit) {
        return baseMapper.pageFindPersonList(page, limit);
    }
}
