package com.mypack.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypack.springboot.dao.inerface.PersonDaoInterface;
import com.mypack.springboot.entity.PersonEntity;

@Service
public class PersonService {
	
	@Autowired
	private PersonDaoInterface personDao;
	
	public List<PersonEntity> getAllPersons() {
		return personDao.findAll();
	}
	
	public PersonEntity addPerson(PersonEntity person) {
		return personDao.save(person);
	}

	public PersonEntity updatePerson(PersonEntity person) {
		return personDao.save(person);
	}

	public void deletePerson(Long personId) {
		personDao.delete(personId);
	}

	public PersonEntity getPerson(Long personId) {
		return personDao.findOne(personId);
	}

}
