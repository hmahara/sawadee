package eu.iamhelmi.sawadee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.iamhelmi.sawadee.entity.Person;
import eu.iamhelmi.sawadee.service.PersonService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/person")
@CrossOrigin
public class PersonController {
	
	@Autowired
	PersonService personService;
	
    // Save operation
    @PostMapping("/save")
    public Person saveDepartment(
        @RequestBody Person department)
    {
        return personService.savePerson(department);
    }
    
    @GetMapping("/list")
    public List<Person> fetchDepartmentList()
    {
        return personService.fetchPersonList();
    }

}
