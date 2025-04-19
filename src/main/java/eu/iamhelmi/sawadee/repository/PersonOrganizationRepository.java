package eu.iamhelmi.sawadee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.iamhelmi.sawadee.entity.PersonOrganization;

@Repository
public interface PersonOrganizationRepository extends JpaRepository<PersonOrganization, Long> {

}
