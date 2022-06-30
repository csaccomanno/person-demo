package person.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import person.demo.model.Person;
import person.demo.service.PersonService;

@RestController
public class PersonController {
	Logger logger = LoggerFactory.getLogger(PersonController.class);

	@Autowired
	PersonService personService;

	// Get all Persons
	@GetMapping("/persons")
	private List<Person> getAllPerson() {
		logger.info("Person Demo. Get all Persons");
		return personService.getAllPerson();
	}
	
	// Add or Update Person
	@PostMapping("/persons")
	private int savePerson(@RequestBody Person person) {
		logger.info("Person Demo. Add or Update Person {}", person);
		personService.saveOrUpdate(person);
		return person.getId();
	}

	// Delete Person
	@DeleteMapping("/persons/{id}")
	private void deletePerson(@PathVariable("id") int id) {
		logger.info("Person Demo. Delete Person id {}", id);
		personService.delete(id);
	}

}
