package com.husu.sqlSession;

import com.husu.pojo.Configuration;
import com.husu.pojo.MappedStatement;

import java.lang.reflect.*;
import java.util.List;

/**
 * @author huyong(husu)
 * @date 4/22/2024 2:51 PM
 */
public class DefaultSqlSession implements SqlSession {
    private Configuration configuration;

    public DefaultSqlSession(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public <E> List<E> selectList(String statementId, Object... params) throws Exception {
        // 将要完成对simpleExecutor中query方法的调用
        SimpleExecutor simpleExecutor = new SimpleExecutor();
        List<Object> list = simpleExecutor.query(configuration, configuration.getMappedStatementMap().get(statementId), params);

        return (List<E>) list;
    }

    @Override
    public <T> T selectOne(String statementId, Object... params) throws Exception {
        List<Object> objects = selectList(statementId, params);
        if (objects.size() == 1) {
            return (T) objects.get(0);
        } else {
            throw new RuntimeException("查询结果为空或者返回结果过多");
        }
    }

    @Override
    public <T> T getMapper(Class<?> mapperClass) {
        // 使用JDK 动态代理为Dao 接口生成代理对象
        Object proxyInstance = Proxy.newProxyInstance(DefaultSqlSession.class.getClassLoader(), new Class[]{mapperClass}, (proxy, method, args) -> {
            // 底层都还是去指定JDBC代码，根据不同情况调用不同的方法
            // 准备参数1：statementId :sql语句的唯一标识， namespace.id = 接口全限定名.方法名
            String methodName = method.getName();
            String className = method.getDeclaringClass().getName();

            String statementId = className + "." + methodName;

            // 准备参数2：参数：args
            // 获取被调用方法的类型
            Type genericReturnType = method.getGenericReturnType();
            if (genericReturnType instanceof ParameterizedType) {
                return selectList(statementId, args);
            }
            return selectOne(statementId, args);
        });

        return (T) proxyInstance;
    }
}
