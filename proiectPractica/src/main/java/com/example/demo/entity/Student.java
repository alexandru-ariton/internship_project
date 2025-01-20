package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String studentName;
	private String studentEmail;
	private String studentAdress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentAdress() {
		return studentAdress;
	}
	public void setStudentAdress(String studentAdress) {
		this.studentAdress = studentAdress;
	}
	public Student(int id, String studentName, String studentEmail, String studentAdress) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentAdress = studentAdress;
	}
	public Student() {
		super();
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", studentAdress=" + studentAdress + "]";
	}
	
}
