package com.training.tcmb.spring;

import com.training.tcmb.spring.java.Hello;
import com.training.tcmb.spring.java.SayHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringProjectApplication implements ApplicationRunner {

	@Autowired
	private SayHello sayHello;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringProjectApplication.class, args);
//		SayHello sayHello = context.getBean(SayHello.class);
//		sayHello.sayIt("mehmet");
//		Hello hello = new Hello();
//		SayHello sayHello = new SayHello(hello);
//		sayHello.sayIt("osman");


	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		sayHello.sayIt("ayşe");
	}
}
