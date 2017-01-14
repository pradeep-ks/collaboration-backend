package com.niit.collaboration.backend.dao;

import java.util.List;

import com.niit.collaboration.backend.model.Blog;

public interface BlogDao {

	void create(Blog blog);
	
	void update(Blog blog);
	
	Blog getBlogById(long blogId);
	
	List<Blog> list();
}
