package com.husu.test;

import com.husu.dao.IUserDao;
import com.husu.io.Resources;
import com.husu.pojo.User;
import com.husu.sqlSession.SqlSession;
import com.husu.sqlSession.SqlSessionFactory;
import com.husu.sqlSession.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

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


        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        List<User> all = userDao.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }
}
