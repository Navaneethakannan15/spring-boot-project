package com.SpringBoot.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.SpringBoot.Project.Repository.AdminRepository;

import com.SpringBoot.Project.model.Admin;

@SpringBootApplication
public class StudentAdmission1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentAdmission1Application.class, args);
	}
	@Autowired
	private AdminRepository adminRepository;
	@Override
	public void run(String... args) throws Exception{
		this.adminRepository.save(new Admin("Kannan"));
		this.adminRepository.save(new Admin("Abinash"));
		this.adminRepository.save(new Admin("Mahendran"));
		
		

}
}
