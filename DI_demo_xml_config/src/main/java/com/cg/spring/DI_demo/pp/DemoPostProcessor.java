package com.cg.spring.DI_demo.pp;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class DemoPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean,String beanName) {
		System.out.println("from ppbi()");
		return bean;
	}
	@Override
	public Object postProcessAfterInitialization(Object bean,String beanName) {
		System.out.println("from ppai()");
		return bean;
	}
}


//these preinit and postinit methods are common to all beans in this application 