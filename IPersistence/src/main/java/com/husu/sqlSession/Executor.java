package com.husu.sqlSession;

import com.husu.pojo.Configuration;
import com.husu.pojo.MappedStatement;

import java.util.List;

/**
 * @author huyong(husu)
 * @date 4/22/2024 3:09 PM
 */
public interface Executor {
    <E> List<E> query(Configuration configuration, MappedStatement mappedStatement, Object... params) throws Exception;
}
