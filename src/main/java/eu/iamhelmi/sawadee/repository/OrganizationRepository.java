package eu.iamhelmi.sawadee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.iamhelmi.sawadee.entity.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {

	public Organization findByOrganizationName (String organizationName);
}
