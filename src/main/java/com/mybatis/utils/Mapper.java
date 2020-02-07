package com.mybatis.utils;

/**
 * ClassName: Mapper
 * Description:
 * date: 2020/2/7 14:15
 *
 * @author JiaLeZhuang
 */

public class Mapper {
    private String queryString;
    private String resultType;

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
}
