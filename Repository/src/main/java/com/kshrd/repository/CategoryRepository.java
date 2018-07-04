package com.kshrd.repository;

import java.util.List;

import com.kshrd.model.Category;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository {

	@Select("SELECT id, name FROM tb_categories ORDER BY id ASC")
	public List<Category> findAll();
	
	@Select("SELECT id, name FROM tb_categories WHERE id=#{id}")
	public Category findOne(int id);
	
}
