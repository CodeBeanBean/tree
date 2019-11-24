package com.doudou.jstree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @Company:
 * @Author: 窦刘柱
 * @Date:2019/11/24
 * @Time:10:30
 */
@Controller
public class IndexController {

    @GetMapping("index")
    public String index(){
        return "index";
    }
}
