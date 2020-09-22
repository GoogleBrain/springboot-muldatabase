package cn.k.springbootmuldatabase;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class SpringbootMuldatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMuldatabaseApplication.class, args);
    }

}
