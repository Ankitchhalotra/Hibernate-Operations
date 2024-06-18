package com.ankit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentInfo")
public class Student {
	
	@Id
	@Column(name="rollNo")
	private int rno;
	
	private String name;
	
	@Column(name="department")
	private String dept;
	
	private String college;
	private int fees;
	
	public Student(int rno, String name, String dept, String college,int fees) {
		super();
		this.rno = rno;
		this.name = name;
		this.dept = dept;
		this.college = college;
		this.fees = fees;
	}
	
	public Student() {
		super();
	}
	public int getRno() {
		return rno;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", dept=" + dept + ", college=" + college + ", fees=" + fees
				+ "]";
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	

}
