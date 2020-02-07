package com.mybatis.sqlsession;

import com.mybatis.utils.Configuration;
import com.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * ClassName: SqlSessionFactoryBuilder
 * Description:
 * date: 2020/2/7 14:11
 *
 * @author JiaLeZhuang
 */

public class SqlSessionFactoryBuilder {
    public SqlSessionFactory build(InputStream in){
        Configuration configuration=XMLConfigBuilder.loadConfiguration(in);

        return new DefaultSqlSessionFactory(configuration);
    }
}
