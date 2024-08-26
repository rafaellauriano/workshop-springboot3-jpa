package com.rafael.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
