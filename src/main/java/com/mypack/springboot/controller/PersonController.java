package com.mypack.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mypack.springboot.controller.base.BaseController;
import com.mypack.springboot.entity.PersonEntity;
import com.mypack.springboot.service.PersonService;

@Controller
@RequestMapping(path = "/demo")
public class PersonController extends BaseController {

	@Autowired
	private PersonService personService;

	@RequestMapping(path = "/")
	public @ResponseBody String hello() {
		return "Hello, Anil";
	}

	@RequestMapping(path = "/addPerson", method = RequestMethod.POST)
	public PersonEntity add(PersonEntity person) {
		return personService.addPerson(person);
	}

	@RequestMapping(path = "/findAllPersons", method = RequestMethod.GET)
	public @ResponseBody List<PersonEntity> getAllPersons() {
		/*
		 * PersonEntity person = new PersonEntity(); person.setFirstName("Anil");
		 * person.setLastName("Minnikanti");
		 * person.setMailId("anil.minnikanti@gmail.com");
		 * person.setPhoneNumber("6475487299"); personService.addPerson(person);
		 */

		return personService.getAllPersons();
	}

}
