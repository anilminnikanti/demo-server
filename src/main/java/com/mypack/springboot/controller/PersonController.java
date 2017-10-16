package com.mypack.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mypack.springboot.controller.base.BaseController;
import com.mypack.springboot.entity.PersonEntity;
import com.mypack.springboot.service.PersonService;

@Controller
@RequestMapping(path = "/demo/persons")
public class PersonController extends BaseController {

	@Autowired
	private PersonService personService;

	@RequestMapping(path = "/")
	public @ResponseBody String hello() {
		return "Hello, This message is from server";
	}
	
	@RequestMapping(path = "/getPerson", method = RequestMethod.GET)
	public PersonEntity getPerson(@RequestParam("personId") Long personId) {
		return personService.getPerson(personId);
	}

	@RequestMapping(path = "/addPerson", method = RequestMethod.POST)
	public PersonEntity addPerson(@RequestBody PersonEntity person) {
		return personService.addPerson(person);
	}
	
	@RequestMapping(path = "/updatePerson", method = RequestMethod.POST)
	public PersonEntity updatePerson(@RequestBody PersonEntity person) {
		return personService.updatePerson(person);
	}
	
	@RequestMapping(path = "/deletePerson", method = RequestMethod.DELETE)
	public String deletePerson(@RequestParam("personId") String personId) {
		try {
			personService.deletePerson(Long.valueOf(personId));
		} catch (Exception e) {
			return "not deleted";
		}
		return "deletd";
	}

	@RequestMapping(path = "/findAllPersons", method = RequestMethod.GET)
	public @ResponseBody List<PersonEntity> getAllPersons() {
		return personService.getAllPersons();
	}

}
