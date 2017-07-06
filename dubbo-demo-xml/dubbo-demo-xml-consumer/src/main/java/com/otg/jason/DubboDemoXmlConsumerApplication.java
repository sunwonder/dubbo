package com.otg.jason;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:appcontext-*.xml")
@SpringBootApplication
public class DubboDemoXmlConsumerApplication {
	public static void main(String[] args) {
		System.out.println("消费者服务启动中");
		SpringApplication.run(DubboDemoXmlConsumerApplication.class, args);
		System.out.println("消费者服务启动中");
	}

}
