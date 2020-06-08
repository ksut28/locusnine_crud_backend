package com.locusnine.crud.assignment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.locusnine.crud.assignment.model.UserModel;

@Repository
public interface UserRepo extends CrudRepository<UserModel, Long> {

	List<UserModel> findAll();

}
