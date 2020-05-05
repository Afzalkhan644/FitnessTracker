package com.pluralsight.repository;

import com.pluralsight.model.User;

public interface UserRepository {

	User register(User user);
	
	User Login(User user);
	
}
