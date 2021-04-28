package com.zs.car.controller;

import com.zs.car.entity.FindPerson;
import com.zs.car.service.FindPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("findPerson")
public class FindPersonController {

    @Autowired
    private FindPersonService findPersonService;

    @RequestMapping("pageFindPersonList")
    public List<FindPerson> pageFindPersonList(@RequestParam("page") Integer page,
                                               @RequestParam("limit") Integer limit) {
        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            e.printStackTrace();
        }

        return findPersonService.pageFindPersonList(page, limit);
    }
}
