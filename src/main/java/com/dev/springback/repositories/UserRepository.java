package com.dev.springback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.springback.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
