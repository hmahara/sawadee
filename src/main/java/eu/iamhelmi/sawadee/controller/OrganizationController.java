package eu.iamhelmi.sawadee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.iamhelmi.sawadee.entity.Organization;
import eu.iamhelmi.sawadee.service.OrganizationService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/organization")
@CrossOrigin
public class OrganizationController {
	
	@Autowired
	OrganizationService organizationService;
	
    // Save operation
    @PostMapping("/save")
    public Organization saveDepartment(
        @RequestBody Organization organization)
    {
        return organizationService.saveOrganization(organization);
    }
    
    @GetMapping("/list")
    public List<Organization> fetchDepartmentList()
    {
        return organizationService.fetchOrganizationList();
    }

}
