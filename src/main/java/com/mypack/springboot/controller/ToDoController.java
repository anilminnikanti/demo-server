package com.mypack.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mypack.springboot.controller.base.BaseController;
import com.mypack.springboot.entity.ToDoEntity;
import com.mypack.springboot.service.ToDoService;

@RestController
@RequestMapping("/todo")
public class ToDoController extends BaseController {

	@Autowired
	private ToDoService toDoService;

	@RequestMapping(path = "/addToDo", method = RequestMethod.POST)
	public ToDoEntity addToDo(ToDoEntity toDo) {
		return toDoService.addToDo(toDo);
	}

	@RequestMapping(path = "/getAllToDo", method = RequestMethod.GET)
	public List<ToDoEntity> findAllToDo() {
		return toDoService.listAllToDo();
	}

}
