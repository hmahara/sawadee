package eu.iamhelmi.sawadee.service;

import java.util.List;

import eu.iamhelmi.sawadee.entity.Organization;
import eu.iamhelmi.sawadee.entity.Person;

public interface OrganizationService {

    // Save operation
	Organization saveOrganization(Organization organization);

    // Read operation
    List<Organization> fetchOrganizationList();

    // Update operation
    Organization updateOrganization(Organization organization,
                                Long organizationId);

    // Delete operation
    void deleteOrganizationById(Long organizationId);
}
