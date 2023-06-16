package com.zeomzzz.loginpractice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.zeomzzz.loginpractice.model.dao")
public class DBConfig {
}