package com.husu.pojo;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huyong(husu)
 * @date 4/19/2024 4:39 PM
 */
public class Configuration {
    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private DataSource dataSource;

    /**
     * key:statementId value:封装好的 MappedStatement 对象
     */
    Map<String, MappedStatement> mappedStatementMap = new HashMap<>();
}
