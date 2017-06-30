package cn.javay.godmars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class GodmarsGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GodmarsGatewayApplication.class, args);
	}

}
