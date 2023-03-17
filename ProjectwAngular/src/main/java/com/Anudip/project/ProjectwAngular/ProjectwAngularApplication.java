package com.Anudip.project.ProjectwAngular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Anudip.project.ProjectwAngular.Repository.UserRepository;
import com.Anudip.project.ProjectwAngular.model.User;

@SpringBootApplication
public class ProjectwAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectwAngularApplication.class, args);
	}
	@Autowired
    private UserRepository userRepository;

    public void run(String...args) throws Exception {
        this.userRepository.save(new User("Ramesh", "Fadatare", "ramesh@gmail.com"));
        this.userRepository.save(new User("Tom", "Cruise", "tom@gmail.com"));
        this.userRepository.save(new User("Tony", "Stark", "tony@gmail.com"));
    }
}


