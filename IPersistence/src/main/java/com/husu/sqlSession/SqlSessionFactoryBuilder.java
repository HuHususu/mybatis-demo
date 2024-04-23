package com.husu.sqlSession;

import com.husu.config.XMLConfigBuilder;
import com.husu.pojo.Configuration;
import org.dom4j.DocumentException;

import java.beans.PropertyVetoException;
import java.io.InputStream;

/**
 * @author huyong(husu)
 * @date 4/19/2024 4:45 PM
 */
public class SqlSessionFactoryBuilder {
    public SqlSessionFactory build(InputStream in) throws DocumentException, PropertyVetoException {
        // 1. 使用dom4j 解析出来的内容封装到Configuration中
        XMLConfigBuilder xmlConfigBuilder = new XMLConfigBuilder();
        Configuration configuration = xmlConfigBuilder.parseConfig(in);

        // 2. 创建SqlSessionFactory对象：工厂类,生产sqlSession 会话对象
        return new DefaultSqlSessionFactory(configuration);
    }
}
