package com.hiro.start.test;

import com.hiro.start.service.UserInfoService;
import com.hiro.start.utils.ApplicationContextUtils;

/**
 * Project: springStart
 *
 * @author : hirolin
 * @date : 2019/5/18 12:23
 */
public class Test {

    public static void main(String [] args) throws ClassNotFoundException {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        UserInfoService userInfoService = (UserInfoService) applicationContext.getBean("userInfoService");
//        userInfoService.say();
        UserInfoService userInfoService = (UserInfoService) ApplicationContextUtils.getApplicationContext().getBean("userInfoService");
        userInfoService.say();
    }
}
