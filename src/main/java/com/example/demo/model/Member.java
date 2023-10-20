package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "member")
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer memberID;
	private String memberName;
	private String memberLastname;
	private String memberPhone;
	private String email;
	
	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Member() {
		super();
	}


	public Member(Integer memberID, String memberName, String memberLastname, String memberPhone, String email) {
		super();
		this.memberID = memberID;
		this.memberName = memberName;
		this.memberLastname = memberLastname;
		this.memberPhone = memberPhone;
		this.email = email;
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


	public String getMemberLastname() {
		return memberLastname;
	}


	public void setMemberLastname(String memberLastname) {
		this.memberLastname = memberLastname;
	}


	public String getMemberPhone() {
		return memberPhone;
	}


	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
}

	

	