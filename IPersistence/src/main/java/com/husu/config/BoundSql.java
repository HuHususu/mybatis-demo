package com.husu.config;

import com.husu.utils.ParameterMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huyong(husu)
 * @date 4/22/2024 4:30 PM
 */
public class BoundSql {
    private String sqlText;
    private List<ParameterMapping> parameterMappingList;
    public BoundSql(String sqlText, List<ParameterMapping> parameterMappingList) {
        this.sqlText = sqlText;
        this.parameterMappingList = parameterMappingList;
    }

    public String getSqlText() {
        return sqlText;
    }

    public void setSqlText(String sqlText) {
        this.sqlText = sqlText;
    }

    public List<ParameterMapping> getParameterMappingList() {
        return parameterMappingList;
    }

    public void setParameterMappingList(List<ParameterMapping> parameterMappingList) {
        this.parameterMappingList = parameterMappingList;
    }
}
