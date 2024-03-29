package com.tns.userservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class userController {
	@Autowired
	private userService service;
	@PostMapping("/userservice")
	public void add(@RequestBody userEntity s) {
		service.save(s);
	}
	@GetMapping("/userService")
	public List<userEntity>listAll(){
		return service.listAll();
	}
	@DeleteMapping("/userService")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

}
