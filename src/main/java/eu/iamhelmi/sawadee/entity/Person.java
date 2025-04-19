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
@Table(name = "PERSON")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PERSON_ID")
	private Long personId;
	@Column(name = "PERSON_UUID")
	private String personUuid;
	
	@Column(name = "FULLNAME")
	private String fullname;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "CONFIRMED")
	private Boolean confirmed;
	
	@Column(name = "ROLE")
	private String role;
	
}

