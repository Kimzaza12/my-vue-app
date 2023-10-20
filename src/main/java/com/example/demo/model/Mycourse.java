package com.example.demo.model;

import org.springframework.boot.context.properties.bind.Name;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "mycrouse")

public class Mycourse {
	 @Id
	
	private String name; 
	private Integer memberID;
	private String memberName;
	private String courseName;
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Mycourse() {
		super();
	}
	
	
	public Mycourse(Integer memberID, String memberName, String courseName) {
		super();
		this.memberID = memberID;
		this.memberName = memberName;
		this.courseName = courseName;
	}
	public Integer getMemberID() {
		return memberID;
	}
	public void setMemberID(Integer memberID) {
		this.memberID = memberID;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
	
	
	
	
	
	
	