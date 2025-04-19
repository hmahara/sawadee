package eu.iamhelmi.sawadee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ORGANIZATION")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Organization {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ORGANIZATION_ID")
	private Long organizationId;
	@Column(name = "ORGANIZATION_UUID")
	private String organizationUuid;
	@Column(name = "ORGANIZATION_NAME")
	private String organizationName;
	
	
}

