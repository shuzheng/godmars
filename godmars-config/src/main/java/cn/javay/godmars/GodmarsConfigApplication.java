package cn.javay.godmars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class GodmarsConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(GodmarsConfigApplication.class, args);
	}

}
