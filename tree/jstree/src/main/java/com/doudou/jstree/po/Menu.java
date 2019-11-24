package com.doudou.jstree.po;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Company:
 * @Author: 窦刘柱
 * @Date:2019/11/23
 * @Time:14:59
 */
@Data
public class Menu {

        // 菜单id
        private String id;
        // 菜单名称
        private String m_name;
        // 父菜单id
        private String parentId;
        // 菜单url
        private String url;
        // 菜单图标
        private String icon;
        // 菜单顺序
        private int sort_num;
        // 子菜单

        private List<Menu> childMenus;
        // ... 省去getter和setter方法以及toString方法

}
