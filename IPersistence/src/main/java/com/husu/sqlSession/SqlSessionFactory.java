package com.husu.sqlSession;

/**
 * @author huyong(husu)
 * @date 4/19/2024 4:47 PM
 */
public interface SqlSessionFactory {
    SqlSession openSession();
}
