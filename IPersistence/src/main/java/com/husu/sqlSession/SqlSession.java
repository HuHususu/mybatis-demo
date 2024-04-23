package com.husu.sqlSession;

import java.util.List;

/**
 * @author huyong(husu)
 * @date 4/22/2024 2:51 PM
 */
public interface SqlSession {
    // 查询所以
    <E> List<E> selectList(String statementId, Object... params) throws Exception;

    // 根据条件查询单个
    <T> T selectOne(String statementId, Object... params) throws Exception;
}
