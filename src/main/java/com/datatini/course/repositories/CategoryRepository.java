package com.datatini.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datatini.course.entities.Category;




public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
