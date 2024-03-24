package com.datatini.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datatini.course.entities.Product;




public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
