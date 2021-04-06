package com.cg.spring.DI_demo.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Wisher implements InitializingBean,DisposableBean {
	private String message;
	public Wisher() {
		System.out.println("object created");
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void wisherinit() {
		System.out.println("From init()");
	}
	public void wisherdestroy() {
		//will be invoked only for singleton object
		System.out.println("From destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initializingbean From init()");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("disposable From destroy()");
		
	}
}
