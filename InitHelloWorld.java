package com.tpoint;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;

public class InitHelloWorld implements BeanPostProcessor {
   public Object postProcessBeforeInitialization(Object bean, String beanName) 
      throws BeansException {
      
      System.out.println("BeforeInitialization of bean: " + beanName);
      return bean;  // you can return any other object as well
   }
   public Object postProcessAfterInitialization(Object bean, String beanName) 
      throws BeansException {
      
      System.out.println("AfterInitialization of bean: " + beanName);
      return bean;  // you can return any other object as well
   }
}
