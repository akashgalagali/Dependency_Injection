package com.cg.javaconfigdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.javaconfigdemo.bean.Address;
import com.cg.javaconfigdemo.bean.Person;

@Configuration
//@ComponentScan(basePackages="com.cg.javaconfigdemo.bean")
public class AppConfig {
	@Bean 
	public Address address() {
		return new Address("3-4-50","ABC_XYZ","Bang","Karnataka");
	}
	@Bean
	public Person person() {
		return new Person(586,"karthik",address());
	}
}
