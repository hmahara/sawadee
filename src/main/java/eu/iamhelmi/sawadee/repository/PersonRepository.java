package eu.iamhelmi.sawadee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.iamhelmi.sawadee.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

	public Person findByEmail(String email);
}
