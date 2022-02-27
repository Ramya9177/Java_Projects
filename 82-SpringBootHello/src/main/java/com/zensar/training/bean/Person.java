package com.zensar.training.bean;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="persons_10")
@XmlRootElement
public class Person {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	int id;
	
	String name;
	LocalDate dateOfBirth;
	Gender gender;
	boolean eligible;
	double salary;
	char proffession;
	
	public Person(int id) {
		super();
		this.id = id;
	}

	public Person(int id, String name, LocalDate dateOfBirth, Gender gender, boolean eligible, double salary,
			char proffession) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.eligible = eligible;
		this.salary = salary;
		this.proffession = proffession;
	}
	
	public Person(String name, LocalDate dateOfBirth, Gender gender, boolean eligible, double salary,
			char proffession) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.eligible = eligible;
		this.salary = salary;
		this.proffession = proffession;
	}
	
	public Person() {
		super();
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public boolean isEligible() {
		return eligible;
	}
	public void setEligible(boolean eligible) {
		this.eligible = eligible;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public char getProffession() {
		return proffession;
	}
	public void setProffession(char proffession) {
		this.proffession = proffession;
	}
	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender
				+ ", eligible=" + eligible + ", salary=" + salary + ", proffession=" + proffession + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id;
	}
	
}
//http://localhost:8080/getPerson/101