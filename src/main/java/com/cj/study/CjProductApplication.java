package com.cj.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.cj.study.mapper")
public class CjProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(CjProductApplication.class, args);
	}

}
