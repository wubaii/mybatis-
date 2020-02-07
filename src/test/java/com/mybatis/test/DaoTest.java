package com.mybatis.test;

import com.mybatis.bean.User;
import com.mybatis.dao.IUserDao;
import com.mybatis.sqlsession.SqlSession;
import com.mybatis.sqlsession.SqlSessionFactory;
import com.mybatis.sqlsession.SqlSessionFactoryBuilder;
import com.mybatis.utils.Resources;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: DaoTest
 * Description:
 * date: 2020/2/7 11:30
 *
 * @author JiaLeZhuang
 */

public class DaoTest {
    public static void main(String[] args){
        InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(in);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        IUserDao userDao=sqlSession.getMapper(IUserDao.class);
        List<User> lists=userDao.findAll();
        System.out.println(lists);
    }
}
