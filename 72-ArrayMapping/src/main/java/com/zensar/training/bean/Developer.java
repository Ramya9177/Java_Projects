package com.zensar.training.bean;

import java.util.Arrays;

public class Developer {
	int id;
	String name;
	String city;
	String [] skills=new String[5];
	
	public Developer() {
		super();
	}

	public Developer(int id, String name, String city, String[] skills) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.skills = skills;
	}

	public Developer(String name, String city, String[] skills) {
		super();
		this.name = name;
		this.city = city;
		this.skills = skills;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "\nDeveloper [id=" + id + ", name=" + name + ", city=" + city + ", skill=" + Arrays.toString(skills) + "]";
	}
	
	

}
