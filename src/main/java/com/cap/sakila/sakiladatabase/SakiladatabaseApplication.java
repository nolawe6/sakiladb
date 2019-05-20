package com.cap.sakila.sakiladatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@PropertySource("classpath:application.properties")
@SpringBootApplication
public class SakiladatabaseApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SakiladatabaseApplication.class);
    }
	
	
	public static void main(String[] args) {
		SpringApplication.run(SakiladatabaseApplication.class, args);
	}

}
