package com.doudou.dao;

import com.doudou.po.CitySimple;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Company:
 * @Author: 窦刘柱
 * @Date:2019/11/24
 * @Time:14:28
 */
@Repository
public interface CitySimpleDao {

    @Select("SELECT id,pid,cityname FROM city ")
    public List<CitySimple> getCitySimple();
}
