package com.olacapstone.socialbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocialbackendApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SocialbackendApplication.class, args);
	}
	@Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(ScimApplication.class);
        }

}
