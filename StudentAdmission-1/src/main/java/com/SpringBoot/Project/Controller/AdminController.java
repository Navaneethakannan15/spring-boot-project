package com.SpringBoot.Project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Project.Repository.AdminRepository;
import com.SpringBoot.Project.model.Admin;


@RestController
@RequestMapping("api/")
public class AdminController {

	
		
			@Autowired
		private AdminRepository adminRepository;
		
		@GetMapping("admin")
		public List<Admin> getUsers(){
			return this.adminRepository.findAll();
}
}
