-- create schema if not exists sawadee;  

DROP TABLE IF EXISTS sawadee.person;

CREATE TABLE sawadee.person (
	PERSON_ID integer AUTO_INCREMENT primary key,
	PERSON_UUID varchar(254),
	FULLNAME varchar(254),
	ROLE varchar(100),
	EMAIL varchar(254),
	CONFIRMED char(1) DEFAULT NULL
	
);
