package com.husu.sqlSession;

import com.husu.pojo.Configuration;

/**
 * @author huyong(husu)
 * @date 4/22/2024 2:46 PM
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(configuration);
    }
}
