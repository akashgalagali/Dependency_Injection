package com.cg.annotationsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.annotationsdemo.bean.Person;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext container=new ClassPathXmlApplicationContext("annotationsdemo_beans.xml");
		//Person p1=container.getBean("per1",Person.class);
		Person p1=container.getBean(Person.class);
		System.out.println(p1.getName()+" "+p1.getSsn());
		System.out.println(p1.getAddress().getHno()+" "+p1.getAddress().getCity()+" "+p1.getAddress().getState()+" "+p1.getAddress().getStreet());
		container.close();
	}

}
