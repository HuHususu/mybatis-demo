package com.husu.test;

import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.InputStream;
import org.junit.Test;

/**
 * @author Ricardo.Y.Hu
 * @date 2024/4/24 0:13
 */
public class MybatisTest {


    public void test() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.mxl");
    }
}
