package com.hiro.beanLifecycle.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Project: springStart
 *
 * @author : hirolin
 * @date : 2019/5/18 16:52
 */
public class Student implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean{

    private String name;

    public String getName() {
        return name;
    }

    /**
     * 8自定义初始化方法
     */
    public void init(){
        System.out.println("Student init ...... ");
    }

    /**
     * 1. bean初始化调用构造方法
     */
    public Student() {
        System.out.println("Student construct ...... ");
    }

    /**
     * 2.设置属性值
     * @param name
     */
    public void setName(String name) {
        System.out.println("Student setName ...... " + name);
        this.name = name;
    }

    /**
     * 4.调用setBeanFactory接口
     * @param beanFactory
     * @throws BeansException
     */
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Student setBeanFactory : " + beanFactory);
    }

    /**
     * 3.调用setBeanName接口
     * @param s
     */
    public void setBeanName(String s) {
        System.out.println("Student setBeanName : " + s);

    }

    /**
     * 5. 调用setApplicationContext
     * @param applicationContext
     * @throws BeansException
     */
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Student setApplicationContext : " + applicationContext);
    }

    /**
     * 7.属性设置之后调用
     * @throws Exception
     */
    public void afterPropertiesSet() throws Exception {
        System.out.println("Student afterPropertiesSet ...... ");
    }

    /**
     * 11 使用接口销毁
     * @throws Exception
     */
    public void destroy() throws Exception {
        System.out.println("Student destroy ...... ");
    }

    /**
     * 12自定义销毁
     */
    public void destroyByXml() {
        System.out.println("Student destroyByXml ...... ");
    }
}
