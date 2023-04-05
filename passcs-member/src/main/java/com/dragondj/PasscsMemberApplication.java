package com.dragondj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
// 开启feign组件，并指出feign接口定义的路径
@EnableFeignClients(basePackages = "com.dragondj.passcs.member.feign")
@SpringBootApplication
@MapperScan("com.dragondj.passcs.member.dao")
public class PasscsMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(PasscsMemberApplication.class, args);
    }

}
