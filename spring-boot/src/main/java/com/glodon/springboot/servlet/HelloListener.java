package com.glodon.springboot.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class HelloListener implements ServletContextListener {

    @Override
    public  void  contextDestroyed(ServletContextEvent arg0){
        System.out.println("ServletContext 对象消耗了");

    }

    @Override
    public  void  contextInitialized(ServletContextEvent  arg0){
        System.out.println("ServletContext 对象创建了");

    }
}