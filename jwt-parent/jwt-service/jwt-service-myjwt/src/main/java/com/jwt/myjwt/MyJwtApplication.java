package com.jwt.myjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author Kjisi
 * @version 1.0
 * @date 2020/6/30 13:31
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"com.jwt.myjwt.dao"})
public class MyJwtApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyJwtApplication.class,args);
    }
}
