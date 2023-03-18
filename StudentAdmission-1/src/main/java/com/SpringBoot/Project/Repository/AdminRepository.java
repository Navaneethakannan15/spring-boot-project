package com.SpringBoot.Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.Project.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{

}
