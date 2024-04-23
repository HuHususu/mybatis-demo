package com.husu.dao;

import com.husu.pojo.User;

import java.util.List;

/**
 * @author huyong(husu)
 * @date 4/23/2024 2:30 PM
 */
public interface IUserDao {
    // 查询所有用户
    List<User> findAll() throws Exception;

    // 根据条件查询用户
    User findByCondition(User user) throws Exception;
}
