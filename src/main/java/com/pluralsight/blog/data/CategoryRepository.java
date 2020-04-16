package com.pluralsight.blog.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.blog.model.Category;


/*
 * @Component public class CategoryRepository {
 * 
 * public List<Category> findAll() { return null; }
 * 
 * public Optional<Category> findById(Long id) { return null; } }
 */

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}