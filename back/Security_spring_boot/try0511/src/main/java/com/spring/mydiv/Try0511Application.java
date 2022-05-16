package com.spring.mydiv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@ComponentScan(basePackages={"src/main/java/com/spring/mydiv/Controller"}) //이거 하니까 된다 ㅜㅜㅜ....
public class Try0511Application {

	public static void main(String[] args) {
		SpringApplication.run(Try0511Application.class, args);
		System.out.print("fin");
	}
	
	@RequestMapping("/")
	public String home() {
		return "hello world spring";
	}
	

}
