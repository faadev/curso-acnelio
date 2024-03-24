package com.datatini.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datatini.course.entities.User;



public interface UserRepository extends JpaRepository<User, Long> {
	

}
