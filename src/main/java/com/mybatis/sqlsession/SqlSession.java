package com.mybatis.sqlsession;

public interface SqlSession {
    <T> T getMapper(Class<T> Class);
}
