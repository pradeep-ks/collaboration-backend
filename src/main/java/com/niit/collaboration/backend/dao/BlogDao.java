package com.niit.collaboration.backend.dao;

import java.util.List;

import com.niit.collaboration.backend.model.Blog;
import com.niit.collaboration.backend.model.Comment;

public interface BlogDao {

	void create(Blog blog);
	
	void update(Blog blog);
	
	void remove(Blog blog);
	
	Blog getBlogById(long blogId);
	
	List<Blog> listNewBlogs();
	
	List<Blog> listApprovedBlogs();
	
	List<Comment> getCommentsByBlogId(long blogId);
	
	void makeComment(Comment comment);
	
}
