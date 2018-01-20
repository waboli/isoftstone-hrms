package com.isoftstone.hrms.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan("com.isoftstone.hrms.mapper")
@EnableTransactionManagement
public class DatabaseConfig {

}
