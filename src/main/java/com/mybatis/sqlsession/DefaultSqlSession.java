package com.mybatis.sqlsession;

import com.mybatis.utils.Configuration;
import com.mybatis.utils.ProxyMethod;

import java.lang.reflect.Proxy;
import java.sql.Connection;

/**
 * ClassName: DefaultSqlSession
 * Description:
 * date: 2020/2/7 14:22
 *
 * @author JiaLeZhuang
 */

public class DefaultSqlSession implements SqlSession {
    private Connection connection;
    private Configuration configuration;

    public DefaultSqlSession(Connection connection, Configuration configuration) {
        this.connection = connection;
        this.configuration = configuration;
    }

    public <T> T getMapper(Class<T> tClass) {
        return (T) Proxy.newProxyInstance(tClass.getClassLoader(),new Class[]{tClass},new ProxyMethod(configuration,connection));
    }
}
