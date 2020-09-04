package com.admin.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient //将此服务注册到Eureka 服务注册中心
@SpringBootApplication//(exclude= {DataSourceAutoConfiguration.class})
public class SpringbootAdminClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAdminClientApplication.class, args);
        System.out.println("AdminClient=> startup completed.");
    }

}
