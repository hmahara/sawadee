package eu.iamhelmi.sawadee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.iamhelmi.sawadee.entity.Person;
import eu.iamhelmi.sawadee.entity.PersonOrganization;
import eu.iamhelmi.sawadee.service.PersonOrganizationService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/person-organization")
@CrossOrigin
public class PersonOrganizationController {
	
	@Autowired
	PersonOrganizationService personService;
	
    // Save operation
    @PostMapping("/save")
    public PersonOrganization savePersonOrganization(
        @RequestBody PersonOrganization personOrganization)
    {
    	log.info("Saving person organization {},  {}", personOrganization.getPerson() ,personOrganization.getOrganization());
        return personService.savePersonOrganization(personOrganization);
        //return personOrganization;
    }
    
//    @GetMapping("/list")
//    public List<Person> fetchDepartmentList()
//    {
//        return personService.fetchPersonList();
//    }

}
