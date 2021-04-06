package com.cg.spring.DI_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.DI_demo.bean.Wisher;

public class App 
{
    public static void main( String[] args )
    {
      ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("Beans.xml");
      Wisher w1= (Wisher)container.getBean("wish1");
   /*   Wisher w1=container.getBean("wish1",Wisher.class);
      System.out.println("W1 message "+w1.getMessage());
      Wisher w2 = container.getBean("wish1",Wisher.class);
      System.out.println("w2 message "+w2.getMessage());
      w1.setMessage("Hello world");
      System.out.println("w1 message updated "+w1.getMessage());
      System.out.println("W2 message "+w2.getMessage());
      */
      container.close();
    }
}
