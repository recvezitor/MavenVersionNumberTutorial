package com.dimas;

import com.dimas.domain.DomainEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloService helloService = context.getBean(HelloService.class);
        System.out.println(helloService.sayHello());
        DomainEntity nxDomain= new DomainEntity();
        System.out.println(nxDomain.age2);
    }
}
