package com.SpringBoot.Project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admission")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String stu_name;
	/*private String fat_name;
	private String dob;
	private String group;*/
	
		
	
	public Admin() {
	}



	public Admin(String stu_name//, String fat_name, String dob, String group
			) 
			{
		super();
		this.stu_name = stu_name;
		/*this.fat_name = fat_name;
		this.dob = dob;
		this.group = group;*/
		
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}


	/*public String getFat_name() {
		return fat_name;
	}

	public void setFat_name(String fat_name) {
		this.fat_name = fat_name;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getGroup() {
		return group;
	}


	public void setGroup(String group) {
		this.group = group;
	}*/



	



	



	
	}
	
	

	


