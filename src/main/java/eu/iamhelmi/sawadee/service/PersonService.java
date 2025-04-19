package eu.iamhelmi.sawadee.service;

import java.util.List;

import eu.iamhelmi.sawadee.entity.Person;

public interface PersonService {

    // Save operation
    Person savePerson(Person person);

    // Read operation
    List<Person> fetchPersonList();

    // Update operation
    Person updatePerson(Person person,
                                Long personId);

    // Delete operation
    void deletePersonById(Long personId);
}
