package com.dragondj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.dragondj.passcs.content.dao")
public class PasscsContentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PasscsContentApplication.class, args);
	}

}
