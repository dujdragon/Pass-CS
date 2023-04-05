package com.dragondj;




import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.dragondj.passcs.question.dao")
@SpringBootApplication
public class PasscsQuestionApplication {

    public static void main(String[] args) {
        SpringApplication.run(PasscsQuestionApplication.class, args);
    }

}
