package com.mybatis.dao;

import com.mybatis.bean.User;

import java.util.List;

/**
 * ClassName: IUserDao
 * Description:
 * date: 2020/2/7 10:47
 *
 * @author JiaLeZhuang
 */

public interface IUserDao {
    /**
     * 查询所有用户信息
     * @return
     */
    List<User> findAll();
}
