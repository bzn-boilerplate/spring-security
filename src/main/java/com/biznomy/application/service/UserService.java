package com.biznomy.application.service;

import com.biznomy.application.model.User;

public interface UserService {

	public User findUserByEmail(String email);

	public void saveUser(User user);

}
