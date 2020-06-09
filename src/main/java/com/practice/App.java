package com.practice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//    		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//    		Laptop t1 = (Laptop) context.getBean("laptop");
//    		Processor p1 = (Processor) context.getBean("processor");
//    		HardDrive h1 = (HardDrive) context.getBean("harddrive");
//    		t1.setHardDrive(h1);
//    		t1.setProcessor(p1);
//    		t1.display();

		Laptop t2 = new Laptop();
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); 
		Processor p2 = context.getBean(Processor.class);
		HardDrive h2  = context.getBean(HardDrive.class);
		t2.setHardDrive(h2);
		t2.setProcessor(p2);
		t2.display();
	}
}
