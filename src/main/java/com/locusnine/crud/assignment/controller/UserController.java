package com.locusnine.crud.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.locusnine.crud.assignment.model.UserModel;
import com.locusnine.crud.assignment.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public ResponseEntity<List<UserModel>> getUsers() {
		return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<List<UserModel>> addUser(@RequestBody UserModel request) {
		return new ResponseEntity<>(userService.addUser(request), HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<List<UserModel>> deleteUser(@RequestParam Long id) {
		
		return new ResponseEntity<>(userService.deleteUser(id), HttpStatus.OK);
	}

	@PutMapping("/edit")
	public ResponseEntity<List<UserModel>> editUser(@RequestBody UserModel request) {
		return new ResponseEntity<>(userService.editUser(request), HttpStatus.OK);
	}

}
