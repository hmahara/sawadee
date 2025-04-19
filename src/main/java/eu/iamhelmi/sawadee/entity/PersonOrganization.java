package eu.iamhelmi.sawadee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PERSON_ORGANIZATION")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonOrganization {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PERSON_ORGANIZATION_ID")
	private Long personOrganizationId;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ORGANIZATION_ID")
	private Organization organization;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PERSON_ID")
	private Person person;

	
}

