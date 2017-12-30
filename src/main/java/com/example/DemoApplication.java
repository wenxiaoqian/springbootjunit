package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author wxq
 */
@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class DemoApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class);
	}
}
