package com.pluralsight.blog.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.blog.model.Category;
import com.pluralsight.blog.model.Post;


/*
 * @Component public class CategoryRepository {
 * 
 * public List<Category> findAll() { return null; }
 * 
 * public Optional<Category> findById(Long id) { return null; } }
 */

public interface CategoryRepository extends JpaRepository<Category, Long> {
	List<Post> findByCategory(Category category);
}