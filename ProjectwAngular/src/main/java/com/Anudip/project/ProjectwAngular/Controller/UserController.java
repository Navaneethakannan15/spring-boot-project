package com.Anudip.project.ProjectwAngular.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Anudip.project.ProjectwAngular.Repository.UserRepository;
import com.Anudip.project.ProjectwAngular.model.User;

@RestController
@RequestMapping("api/")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("users")
	public List<User> getUsers(){
		return this.userRepository.findAll();
	}
	
	

}
