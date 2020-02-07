package com.mybatis.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;

/**
 * ClassName: ProxyMethod
 * Description:
 * date: 2020/2/7 14:31
 *
 * @author JiaLeZhuang
 */

public class ProxyMethod implements InvocationHandler {
    private Configuration configuration;
    private Connection connection;

    public ProxyMethod(Configuration configuration,Connection connection) {
        this.configuration = configuration;
        this.connection=connection;
    }

    public Object invoke(Object proxy, Method method, Object[] args) {
        String className=method.getDeclaringClass().getName();
        String methodName=method.getName();
        Mapper mapper=configuration.getMappers().get(className+"."+methodName);
        Executor executor=new Executor();
        Object object=executor.selectList(mapper,connection);
        return object;
    }
}
