package com.isoftstone.hrms.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@MapperScan是mybatis-spring中提供的一个注解,指定Mapper类所在的包
@MapperScan("com.isoftstone.hrms.mapper")
public class DatabaseConfig {

}
