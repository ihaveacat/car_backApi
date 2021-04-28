package com.zs.car.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zs.car.entity.FindPerson;

import java.util.List;

public interface FindPersonService extends IService<FindPerson> {

    List<FindPerson> pageFindPersonList(Integer page, Integer limit);
}
