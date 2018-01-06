package com.isoftstone.hrms.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.isoftstone.hrms.mapper")
public class DatabaseConfig {

}
