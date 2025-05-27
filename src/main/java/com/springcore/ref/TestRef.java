
package com.springcore.ref;

import com.springcore.ref.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestRef {
    
    public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
         A temp =(A)context.getBean("aref");
         System.out.println(temp.getX());
         
         System.out.println(temp.getOb().getY());
    } 
}
