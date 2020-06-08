package com.locusnine.crud.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locusnine.crud.assignment.model.UserModel;
import com.locusnine.crud.assignment.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;

	public List<UserModel> getUsers() {
		List<UserModel> userDetailsList = userRepo.findAll();
		return userDetailsList;
	}

	public List<UserModel> deleteUser(Long id) {
		userRepo.deleteById(id);
		return getUsers();
	}

	public List<UserModel> addUser(UserModel userModel) {
		userRepo.save(userModel);
		return getUsers();
	}

	public List<UserModel> editUser(UserModel userModel) {
//		UserEntity userEntity = new UserEntity();
//		userEntity.setUserId(userRequest.getUserId());
//		userEntity.setUserEmail(userRequest.getUserEmail());
//		userEntity.setUserName(userRequest.getUserName());
//		userEntity.setUserRole(userRequest.getUserRole());
//		userEntity.setUserStatus(userRequest.getUserStatus());
		userRepo.save(userModel);
		return getUsers();
	}

}
