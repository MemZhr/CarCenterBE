package com.example.carservicecenter;


import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@SpringBootApplication
public class CenterApplication {
	@Bean
	public WebMvcConfigurer corsConfigurer(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry){
				registry.addMapping("/api/**").allowedMethods("*").allowedOrigins("*");
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(CenterApplication.class, args);

	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}





//	@Bean
//	CommandLineRunner run(UserService userService) {
//		return args -> {
//			userService.saveRole(new Role(null, "ROLE_USER"));
//			userService.saveRole(new Role(null, "ROLE_ADMIN"));
//
//			userService.saveUser(new User(null, "Mem Zh", "MemZh", "1987", new ArrayList<>()));
////			userService.saveUser(new User(null, "James Smith", "james", "1234", new ArrayList<>()));
////			userService.saveUser(new User(null, "Jane Carry", "jane", "1234", new ArrayList<>()));
////			userService.saveUser(new User(null, "Chris Anderson", "chris", "1234", new ArrayList<>()));
//
////			userService.addRoleToUser("john", "ROLE_USER");
//			userService.addRoleToUser("MemZh", "ROLE_ADMIN");
////			userService.addRoleToUser("jane", "ROLE_USER");
////			userService.addRoleToUser("chris", "ROLE_ADMIN");
////			userService.addRoleToUser("chris", "ROLE_USER");
//		};
//	}

}
