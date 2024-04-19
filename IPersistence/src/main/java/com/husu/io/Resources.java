package com.husu.io;

import java.io.InputStream;

/**
 * @author huyong(husu)
 * @date 4/19/2024 4:19 PM
 */
public class Resources {
    // 根据配置文件的路径，将配置文件加载成字节流，存储在内存中
    public static InputStream getResourceAsStream(String path) {
        InputStream resourceAsStream = Resources.class.getClassLoader().getResourceAsStream(path);
        return resourceAsStream;
    }
}
