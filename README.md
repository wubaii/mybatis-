# simple-mybatis

是对mybatis底层原理的一个简单实现。

主要工作有：

* 解析配置文件生成Configuration对象封装JDBC连接信息及Mapper对象
* 自定义SqlsessionFactory以及SqlsessionFactory
* 自定义Executor进行底层JDBC操作
* 生成Dao的代理对象