package eu.iamhelmi.sawadee.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.iamhelmi.sawadee.entity.Organization;
import eu.iamhelmi.sawadee.entity.Person;
import eu.iamhelmi.sawadee.entity.PersonOrganization;
import eu.iamhelmi.sawadee.repository.OrganizationRepository;
import eu.iamhelmi.sawadee.repository.PersonOrganizationRepository;
import eu.iamhelmi.sawadee.repository.PersonRepository;

@Service
public class PersonOrganizationServiceImpl implements PersonOrganizationService {
	
	@Autowired
	OrganizationRepository organizationRepository;
	
	@Autowired
	PersonRepository personRepository;
	
	@Autowired
	PersonOrganizationRepository personOrganizationRepository;

	@Override
	public PersonOrganization savePersonOrganization(PersonOrganization personOrganization) {
		
		Person p = personOrganization.getPerson();
		Person pInDb = personRepository.findByEmail(p.getEmail());
		if (pInDb == null) {
			if (p.getPersonUuid() == null || p.getPersonUuid().length()<16) {
				p.setPersonUuid(UUID.randomUUID().toString());
			}
			pInDb = personRepository.save(p);
		}
		
		Organization o = personOrganization.getOrganization();
		Organization oInDb = organizationRepository.findByOrganizationName(o.getOrganizationName());
		
		if (oInDb == null) {
			if (o.getOrganizationUuid()==null || o.getOrganizationUuid().length()<16) {
				o.setOrganizationUuid(UUID.randomUUID().toString());
			}
			oInDb = organizationRepository.save(o);
		}
		PersonOrganization po = PersonOrganization.builder().person(pInDb).organization(oInDb).build();
		po = personOrganizationRepository.save(po);
		return po;
	}

	@Override
	public List<Person> fetchPersonList() {
		// TODO Auto-generated method stub
		return null;
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
