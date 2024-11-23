package com.abhijeet.service;

import java.util.List;

import com.abhijeet.exception.UserException;
import com.abhijeet.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
