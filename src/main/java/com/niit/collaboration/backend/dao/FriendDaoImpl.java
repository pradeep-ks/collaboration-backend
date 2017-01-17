package com.niit.collaboration.backend.dao;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collaboration.backend.model.Friend;

@Repository("friendDao")
@EnableTransactionManagement
@Transactional
public class FriendDaoImpl implements FriendDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	UserDao userDao;
	
	public void add(Friend friend) {
		sessionFactory.getCurrentSession().saveOrUpdate(friend);
	}

	public void update(Friend friend) {
		sessionFactory.getCurrentSession().saveOrUpdate(friend);
	}

	public Friend getFriend(long userId, long friendId) {
		String hql = "from Friend where userId=" + userId + " and friendId=" + friendId;
		Friend friend = null;
		try {
			friend = (Friend) sessionFactory.getCurrentSession().createQuery(hql).getSingleResult();
		} catch (NoResultException e) {
			e.printStackTrace(System.err);
		}
		return friend;
	}

	@SuppressWarnings("unchecked")
	public List<Friend> listMyFriends(long userId) {
		String hql = "from Friend where userId=" + userId;
		List<Friend> friends = sessionFactory.getCurrentSession().createQuery(hql).getResultList();
		return friends;
	}

	@SuppressWarnings("unchecked")
	public List<Friend> listNewFriendRequests(long userId) {
		String hql = "from Friend where userId=" + userId + " where status='NEW'";
		List<Friend> friends = sessionFactory.getCurrentSession().createQuery(hql).getResultList();
		return friends;
	}

	public void setOnline(long userId) {
		// TODO Auto-generated method stub
		
	}

	public void setOffline(long userId) {
		// TODO Auto-generated method stub
		
	}

}