package com.mortgage;

import org.springframework.data.repository.CrudRepository;

public interface PersonalDetailsInterface extends CrudRepository<PersonalDetails, Integer>{

	
	public PersonalDetails getPersonalDetailsById(int id);

}
