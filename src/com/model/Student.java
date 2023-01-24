package com.model;

import java.util.List;

public class Student {
	private String  id_Student;
	private String name_Student;
	private String grade;
	private String email;
	private String address;
	private String region;
	private String country;
	private List<Course>courses;
	
	public Student(String id_Student, String name_Student, String grade, String email, String address, String region,String country, List<Course> courses) {
		super();
		this.id_Student = id_Student;
		this.name_Student = name_Student;
		this.grade = grade;
		this.email = email;
		this.address = address;
		this.region = region;
		this.country = country;
		this.courses = courses;
	}
	public String getId_Student() {
		return id_Student;
	}
	public void setId_Student(String id_Student) {
		this.id_Student = id_Student;
	}
	public String getName_Student() {
		return name_Student;
	}
	public void setName_Student(String name_Student) {
		this.name_Student = name_Student;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	 @Override
	    public String toString() {
	        return id_Student+" "+ name_Student +"   " + grade + "  " + email + "    "+ address +"   " + region + "    " + country ;
	    }
	
}
