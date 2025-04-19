create schema if not exists sawadee;  

DROP TABLE IF EXISTS sawadee.person_organization;

CREATE TABLE sawadee.person_organization (
	PERSON_ORGANIZATION_ID integer AUTO_INCREMENT primary key,
	ORGANIZATION_ID integer,
	PERSON_ID integer

	
);
