package com.mybatis.sqlsession;

import com.mybatis.utils.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ClassName: DefaultSqlSessionFactory
 * Description:
 * date: 2020/2/7 14:21
 *
 * @author JiaLeZhuang
 */

public class DefaultSqlSessionFactory implements SqlSessionFactory{
    private Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    public SqlSession openSession() {
        Connection connection=null;
        try {
            Class.forName(configuration.getDriver());
            connection=DriverManager.getConnection(configuration.getUrl(),configuration.getUsername(),configuration.getPassword());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new DefaultSqlSession(connection,configuration);
    }
}
