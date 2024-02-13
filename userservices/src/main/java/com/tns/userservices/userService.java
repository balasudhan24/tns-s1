package com.tns.userservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class userService {
	@Autowired
	private userRepository service_repo;
	//to display all records
	public List<userEntity>listAll(){
		return service_repo.findAll();
	}
	//to insert the new record
	public void save(userEntity s) {
		service_repo.save(s);
	}
	//to get the specific record
	public userEntity get(Integer id) {
		return service_repo.findById(id).get();
	
	}
	//to delete the record
	public void delete(Integer id) {
		 service_repo.deleteById(id);
	}

}
