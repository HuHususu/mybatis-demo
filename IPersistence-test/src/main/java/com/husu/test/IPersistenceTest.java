package com.husu.test;

import com.husu.io.Resources;
import com.husu.sqlSession.SqlSessionFactory;
import com.husu.sqlSession.SqlSessionFactoryBuilder;
import org.dom4j.DocumentException;

import java.io.InputStream;

/**
 * @author huyong(husu)
 * @date 4/19/2024 4:07 PM
 */
public class IPersistenceTest {
    public void test() throws DocumentException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    }
}
