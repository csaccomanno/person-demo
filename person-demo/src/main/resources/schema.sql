DROP TABLE IF EXISTS PERSONS;  

CREATE TABLE PERSONS (  
	id INT AUTO_INCREMENT NOT NULL,  
	name VARCHAR(255) NOT NULL,  
	last_name VARCHAR(255) NOT NULL,  
	dni INT,
	employee BOOLEAN,
	PRIMARY KEY (id)
);  