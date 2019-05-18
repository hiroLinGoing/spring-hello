package com.hiro.start.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Project: springStart
 *
 * @author : hirolin
 * @date : 2019/5/18 12:34
 */
//使用final修饰 保证class不被继承修改
final public class ApplicationContextUtils {

    private static ApplicationContext applicationContext = null;

    //创建空的构造器
    public ApplicationContextUtils() {

    }

    //饿汉式单例 类文件加载的时候就会初始化
    static {
        applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }

    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }
}
