package com.mypack.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@RequestMapping(path = "/addPerson", method = RequestMethod.POST)
	public PersonEntity add(@RequestBody PersonEntity person) {
		return personService.addPerson(person);
	}

	@RequestMapping(path = "/findAllPersons", method = RequestMethod.GET)
	public @ResponseBody List<PersonEntity> getAllPersons() {

		/*PersonEntity person = new PersonEntity();
		person.setFirstName("Mano");
		person.setLastName("Nimmi");
		person.setMailId("anil.minnikanti@gmail.com");
		person.setPhoneNumber("1213232321");
		personService.addPerson(person);*/

		return personService.getAllPersons();
	}

}
