package com.husu.dao;

import com.husu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author huyong(husu)
 * @date 4/24/2024 2:25 PM
 */
public interface UserMapper {
    List<User> findAll();

    User findById(@Param("id") int id);

}
