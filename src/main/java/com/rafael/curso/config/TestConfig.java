package com.rafael.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rafael.curso.entities.User;
import com.rafael.curso.repositories.UserRepository;

@Configuration//para dizer que é uma classe auxiliar de configuração
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired//dependência
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Rafael Silva", "silva@gmail.com", "333333330", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
		
	}
	
	

}
