package com.javaweb.userdpt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaweb.userdpt.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
