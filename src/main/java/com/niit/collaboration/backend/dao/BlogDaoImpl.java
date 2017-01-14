package com.niit.collaboration.backend.dao;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collaboration.backend.model.Blog;

@Repository("blogDao")
@EnableTransactionManagement
@Transactional
public class BlogDaoImpl implements BlogDao {

	@Autowired
	SessionFactory sessionFactory;

	public void create(Blog blog) {
		sessionFactory.getCurrentSession().saveOrUpdate(blog);
	}

	public void update(Blog blog) {
		sessionFactory.getCurrentSession().saveOrUpdate(blog);
	}

	public Blog getBlogById(long blogId) {
		String hql = "from Blog where blogId=" + blogId;
		Blog blog = null;
		try {
			blog = (Blog) sessionFactory.getCurrentSession().createQuery(hql).getSingleResult();
		} catch (NoResultException e) {
			e.printStackTrace(System.err);
		}
		return blog;
	}

	@SuppressWarnings("unchecked")
	public List<Blog> list() {
		List<Blog> blogs = sessionFactory.getCurrentSession().createQuery("from Blog").getResultList();
		return blogs;
	}
}
