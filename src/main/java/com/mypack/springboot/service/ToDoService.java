package com.mypack.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypack.springboot.dao.inerface.ToDoDaoInterface;
import com.mypack.springboot.entity.ToDoEntity;
import com.mypack.springboot.service.base.BaseService;

@Service
public class ToDoService extends BaseService {

	@Autowired
	private ToDoDaoInterface toDoDao;

	public ToDoEntity addToDo(ToDoEntity toDo) {
		return toDoDao.save(toDo);
	}
	
	public List<ToDoEntity> listAllToDo() {
		return toDoDao.findAll();
	}

}
