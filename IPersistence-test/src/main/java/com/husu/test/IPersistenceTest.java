package com.husu.test;

import com.husu.io.Resources;
import com.husu.pojo.User;
import com.husu.sqlSession.SqlSession;
import com.husu.sqlSession.SqlSessionFactory;
import com.husu.sqlSession.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * @author huyong(husu)
 * @date 4/19/2024 4:07 PM
 */
public class IPersistenceTest {
    @Test
    public void test() throws Exception {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();


        // 调用
        User user = new User();
        user.setId(1);
        user.setUsername("husu");
        User user2 = sqlSession.selectOne("user.selectOne", user);
        System.out.println(user2);
    }
}
