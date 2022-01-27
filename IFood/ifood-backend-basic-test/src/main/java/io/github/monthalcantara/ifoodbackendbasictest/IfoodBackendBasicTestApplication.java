package io.github.monthalcantara.ifoodbackendbasictest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class IfoodBackendBasicTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(IfoodBackendBasicTestApplication.class, args);
	}

}
