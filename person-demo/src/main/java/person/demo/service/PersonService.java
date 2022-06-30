package person.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import person.demo.model.Person;
import person.demo.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository personRepository;

	public List<Person> getAllPerson() {
		List<Person> persons = new ArrayList<Person>();
		personRepository.findAll().forEach(person -> persons.add(person));
		return persons;
	}

	public void saveOrUpdate(Person Person) {
		personRepository.save(Person);
	}

	public void delete(int id) {
		personRepository.deleteById(id);
	}

}
