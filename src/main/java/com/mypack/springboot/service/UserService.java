package com.mypack.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypack.springboot.dao.inerface.UserDaoInterface;
import com.mypack.springboot.entity.UserEntity;
import com.mypack.springboot.service.base.BaseService;

@Service
public class UserService extends BaseService {
	
	@Autowired
	private UserDaoInterface userDao;
	
	public UserEntity getUserById(long id) {
		return userDao.findOne(id);
	}

}
