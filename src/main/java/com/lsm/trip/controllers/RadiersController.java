package com.lsm.trip.controllers;

import com.lsm.trip.dto.Radiers;
import com.lsm.trip.service.RadiersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lv on 2017/4/28.
 * 景点的控制器
 */
@Controller
@RequestMapping("radier")
public class RadiersController {
    @Autowired
    RadiersService radiersService;
    @RequestMapping(value = "/addRadier",method = RequestMethod.POST)
    @ResponseBody
    public String addRadiers(Radiers radiers){
       System.out.print("--攻略--"+radiers.getTitle()+"||"+radiers.getContent()+"||"+radiers.getSid());
        try {
            radiersService.addRadiers(radiers);
            return "1";
        } catch (Exception e) {
            e.printStackTrace();
            return "0";
        }
    }
}
