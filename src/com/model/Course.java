package com.model;

public class Course {
	private int id_Course;
	private String Course_Name;
	private String instructor;
	private String Course_duration;
	private String Course_time;
	private String Location;
	public Course(int id_Course, String course_Name, String instructor, String course_duration, String course_time,
			String location) {
		super();
		this.id_Course = id_Course;
		Course_Name = course_Name;
		this.instructor = instructor;
		Course_duration = course_duration;
		Course_time = course_time;
		Location = location;
	}
	public int getId_Course() {
		return id_Course;
	}
	public void setId_Course(int id_Course) {
		this.id_Course = id_Course;
	}
	public String getCourse_Name() {
		return Course_Name;
	}
	public void setCourse_Name(String course_Name) {
		Course_Name = course_Name;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public String getCourse_duration() {
		return Course_duration;
	}
	public void setCourse_duration(String course_duration) {
		Course_duration = course_duration;
	}
	public String getCourse_time() {
		return Course_time;
	}
	public void setCourse_time(String course_time) {
		Course_time = course_time;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}


}
