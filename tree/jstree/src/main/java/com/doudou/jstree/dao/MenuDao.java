package com.doudou.jstree.dao;

import com.doudou.jstree.po.Menu;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Company:
 * @Author: 窦刘柱
 * @Date:2019/11/23
 * @Time:15:09
 */
@Repository
public interface MenuDao {
    @Select("SELECT id,m_name,parentId,url,icon,sort_num \n" +
            "FROM jrbac_menu\n" +
            "ORDER BY sort_num ASC" )
    public List<Menu> queryMenuList();
}
