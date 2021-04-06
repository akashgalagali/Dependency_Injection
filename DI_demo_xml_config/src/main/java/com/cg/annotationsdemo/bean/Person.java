package com.cg.annotationsdemo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component//@Repository || @Service can also be used
public class Person {
	int ssn=7002;
	String name="Ajay";
	@Autowired
	//@Qualifier("add2")// helps to select one form many 
	Address address;
	public Person() {}
	public Person(Address add) {
		this.address=add;
	}
	public Person(int ssn, String name, Address address) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
