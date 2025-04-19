package eu.iamhelmi.sawadee.service;

import java.util.List;

import eu.iamhelmi.sawadee.entity.Person;
import eu.iamhelmi.sawadee.entity.PersonOrganization;

public interface PersonOrganizationService {

    // Save operation
    PersonOrganization savePersonOrganization(PersonOrganization person);

    // Read operation
    List<Person> fetchPersonList();

    // Update operation
    Person updatePerson(Person person,
                                Long personId);

    // Delete operation
    void deletePersonById(Long personId);
}
