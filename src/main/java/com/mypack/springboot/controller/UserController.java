package com.mypack.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mypack.springboot.controller.base.BaseController;
import com.mypack.springboot.entity.UserEntity;
import com.mypack.springboot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(path = "/authUser/{id}/{password}", method = RequestMethod.GET)
	public UserEntity getUserById(@PathVariable("id") long id, @PathVariable("password") String password) {
		return userService.getUserById(id);
	}

}
