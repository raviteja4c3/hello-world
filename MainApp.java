package com.tpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("Beans.xml");
	      HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
	      obj1.setMessage("This is Instanace1");
	      obj1.getMessage();
	      
	      HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
	      obj2.getMessage();
	      
	      context.registerShutdownHook();       	      
	}
}
