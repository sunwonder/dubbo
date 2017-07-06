package com.otg.jason;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:appcontext-*.xml")
@SpringBootApplication
public class DubboDemoXmlProviderApplication {
	public static void main(String[] args) {
		System.out.println("服务启动中");
		SpringApplication.run(DubboDemoXmlProviderApplication.class, args);
		System.out.println("服务启动完成");
	}
}
