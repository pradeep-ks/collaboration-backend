package com.niit.collaboration.backend.dao;

import java.util.List;

import com.niit.collaboration.backend.model.Friend;

public interface FriendDao {
	
	void add(Friend friend);
	
	void update(Friend friend);
	
	Friend getFriend(long userId, long friendId);
	
	List<Friend> listMyFriends(long userId);
	
	List<Friend> listNewFriendRequests(long userId);
	
	void setOnline(long userId);
	
	void setOffline(long userId);
	
}
