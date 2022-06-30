package person.demo.repository;

import org.springframework.data.repository.CrudRepository;

import person.demo.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
