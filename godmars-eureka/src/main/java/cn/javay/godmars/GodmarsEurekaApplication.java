package cn.javay.godmars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GodmarsEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GodmarsEurekaApplication.class, args);
	}

}
