package com.mybatis.utils;

import java.io.InputStream;

/**
 * ClassName: Resources
 * Description:
 * date: 2020/2/7 14:07
 *
 * @author JiaLeZhuang
 */

public class Resources {
    public static InputStream getResourceAsStream(String path){
        return Resources.class.getClassLoader().getResourceAsStream(path);
    }
}
