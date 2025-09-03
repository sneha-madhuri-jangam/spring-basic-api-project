package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
// import org.springframework.boot.web.servlet.FilterRegistrationBean;
// import org.springframework.boot.web.servlet.error.ErrorPageFilter;
// import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// Prevent ErrorPageFilter conflict when deploying to external Tomcat
    // @Bean
    // public FilterRegistrationBean<ErrorPageFilter> disableSpringBootErrorFilter(ErrorPageFilter filter) {
    //     FilterRegistrationBean<ErrorPageFilter> registration = new FilterRegistrationBean<>(filter);
    //     registration.setEnabled(false);
    //     return registration;
    // }

}


