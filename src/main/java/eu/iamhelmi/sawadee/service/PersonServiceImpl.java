package eu.iamhelmi.sawadee.service;

import java.util.List;
import java.util.UUID;

import org.apache.kafka.common.Uuid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.iamhelmi.sawadee.entity.Person;
import eu.iamhelmi.sawadee.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	PersonRepository personRepository;

	@Override
	public Person savePerson(Person person) {
		log.info("Saving person  {}", person.getFullname());
		if (person.getPersonUuid() == null || person.getPersonUuid().length()<16) {
			person.setPersonUuid(UUID.randomUUID().toString());
			
			
		}
		person = personRepository.save(person);
		return person;
		
	}

	@Override
	public List<Person> fetchPersonList() {
		return ( List<Person>) personRepository.findAll();
	}

	@Override
	public Person updatePerson(Person person, Long personId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePersonById(Long personId) {
		// TODO Auto-generated method stub
		
	}

}
