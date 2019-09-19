package com.new1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="students")

public class Student {

	@Id
	@Column(name="rollno")
	private int rollno;
	@Column(name="name")
	private String name;
	@Column(name="mark")
	private int mark;
	public Student() {};

	public Student(int rollno, String name, int mark) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	

}
