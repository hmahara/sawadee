create schema if not exists sawadee;  

DROP TABLE IF EXISTS sawadee.organization;

CREATE TABLE sawadee.organization (
	ORGANIZATION_ID integer AUTO_INCREMENT primary key,
	ORGANIZATION_UUID varchar(254),
	ORGANIZATION_NAME varchar(254)
	
);
