package com.arun.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arun.beans.Library;

public class LaunchMain {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Library obj=context.getBean("library",Library.class);
		obj.selection();

	}

}
