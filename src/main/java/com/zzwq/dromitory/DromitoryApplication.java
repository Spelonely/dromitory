package com.zzwq.dromitory;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.zzwq.dromitory.mapper")
@SpringBootApplication
public class DromitoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DromitoryApplication.class, args);
	}
}
