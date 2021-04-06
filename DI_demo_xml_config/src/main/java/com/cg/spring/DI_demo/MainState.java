package com.cg.spring.DI_demo;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.DI_demo.bean.State;
import com.cg.spring.DI_demo.bean.State2;

public class MainState {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("Beans4.xml");
		System.out.println("=========Using List/set======");
		State s=container.getBean("state1",State.class);
		System.out.println(s.getStateName());
		for(String c:s.getCities()) {
			System.out.println("\t|->"+c);
		}
		System.out.println("=========Using MAPS======");
		State2 s2=container.getBean("state2",State2.class);
		System.out.println(s2.getStateName());
		for(Map.Entry<String,String> c:s2.getCities().entrySet()) {
			System.out.println("\t"+c.getKey()+"\t"+c.getValue());
		}
		container.close();
	}

}
