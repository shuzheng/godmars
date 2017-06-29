package cn.javay.godmars;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@RestController
public class GodmarsConfigApplication {

	@Value("${config.name}")
	String name = "World";

	@RequestMapping("/")
	public String home() {
		return "Hello " + name;
	}

	public static void main(String[] args) {
		SpringApplication.run(GodmarsConfigApplication.class, args);
	}

}
