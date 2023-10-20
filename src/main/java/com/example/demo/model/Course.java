package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="course")
public class Course {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	private Integer courseID;
	private String courseName;
	private String courseDetail;
	private String teacher;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Course() {
		super();
	}
	
	public Course(Integer courseID, String courseName, String courseDetail, String teacher) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.courseDetail = courseDetail;
		this.teacher = teacher;
	}
	public Integer getCourseID() {
		return courseID;
	}
	public void setCourseID(Integer courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDetail() {
		return courseDetail;
	}
	public void setCourseDetail(String courseDetail) {
		this.courseDetail = courseDetail;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	
}
	
