package com.hiro.beanLifecycle.test;

import com.hiro.beanLifecycle.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Project: springStart
 *
 * @author : hirolin
 * @date : 2019/5/18 16:52
 */
public class test {

    public static void main(String [] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beanLifecycle.xml");
        //10 使用bean
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student.toString());
        applicationContext.close();
    }
}
