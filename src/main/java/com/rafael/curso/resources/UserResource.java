package com.rafael.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.curso.entities.User;

@RestController//quer dizer que essa classe é um recurso web emplementado por um controlador rest
@RequestMapping(value = "/users")//nome do recurso
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail", "999999999", "1234");
		return ResponseEntity.ok().body(u);
	}

}
