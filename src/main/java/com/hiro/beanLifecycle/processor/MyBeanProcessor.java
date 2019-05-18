package com.hiro.beanLifecycle.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 * Project: springStart
 *
 * @author : hirolin
 * @date : 2019/5/18 17:38
 */
public class MyBeanProcessor implements BeanPostProcessor{
    /**
     *6.预先初始化处理方法，通常可以对所有的bean进行自定义操作
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Nullable
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanProcessor postProcessBeforeInitialization ...... ");
        return null;
    }

    /**
     * 9.后处理方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Nullable
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanProcessor postProcessAfterInitialization ...... ");
        return null;
    }
}
