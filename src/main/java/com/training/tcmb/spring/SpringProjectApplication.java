package com.training.tcmb.spring;

import com.training.tcmb.other.OtherConfig;
import com.training.tcmb.spring.java.Hello;
import com.training.tcmb.spring.java.SayHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

// @SpringBootApplication(scanBasePackages = {"com.training.tcmb.spring","com.training.tcmb.other"})
@SpringBootApplication
@Import(OtherConfig.class)
public class SpringProjectApplication implements ApplicationRunner {

	@Autowired
	private SayHello sayHello;

	@Autowired
	private Hello hello;

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
		hello.hello("osman");
		sayHello.sayIt("ayşe");
	}
}
