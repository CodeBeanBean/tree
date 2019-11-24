package com.doudou.jstree.service;

import com.doudou.jstree.dao.MenuDao;
import com.doudou.jstree.po.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Company:
 * @Author: 窦刘柱
 * @Date:2019/11/23
 * @Time:15:50
 */
@Service
public class MenuImpl {
    @Autowired
    private  MenuDao menuDao;

    public List<Menu> getMenu(){

    return menuDao.queryMenuList();
    }
}
