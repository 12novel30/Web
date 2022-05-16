package com.spring.mydiv.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

@Override
	public void addViewControllers(ViewControllerRegistry registry) {
          registry.addRedirectViewController("/", "/index");
          registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
	}
    
}    