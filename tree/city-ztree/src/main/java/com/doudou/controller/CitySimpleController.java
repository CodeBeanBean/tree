package com.doudou.controller;

import com.doudou.dao.CitySimpleDao;
import com.doudou.po.CitySimple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description:
 * @Company:
 * @Author: 窦刘柱
 * @Date:2019/11/24
 * @Time:14:34
 */
@Controller
@RequestMapping("city")
public class CitySimpleController {
    @Autowired
    CitySimpleDao citySimpleDao;

    @RequestMapping("show")  // menu/show
    @ResponseBody
    public  Object getCity(){
        List<CitySimple> cityList = citySimpleDao.getCitySimple();
        return cityList;
    }
}
