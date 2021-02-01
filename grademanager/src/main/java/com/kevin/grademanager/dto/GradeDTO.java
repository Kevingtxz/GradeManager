package com.kevin.grademanager.dto;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.kevin.grademanager.domain.Grade;

public class GradeDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String subject;
	private String grade;
	private String approved;
	private String student_name;
	
	@DBRef(lazy=true)
	private StudentDTO student;
	
	public GradeDTO() {
	}

	public GradeDTO(String id, String subject, String grade, String approved, String student_name, StudentDTO student) {
		super();
		this.id = id;
		this.student_name = student_name;
		this.subject= subject;
		this.grade = grade;
		this.approved = approved;
		this.student = student;
	}

	public GradeDTO(Grade grade) {
		super();
		this.id = grade.getId();
		this.student_name = grade.getStudent().getStudent_name();
		this.subject = grade.getSubject();
		this.grade = grade.getGrade();
		this.approved = grade.getApproved();
		this.student = grade.getStudent();
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject= subject;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
	}

	public StudentDTO getStudent() {
		return student;
	}

	public void setStudent(StudentDTO student) {
		this.student = student;
	}
}
