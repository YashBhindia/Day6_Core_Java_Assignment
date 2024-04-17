package com.masai;

import java.io.Serializable;

public class Student implements Serializable {

	private String name;
	private int studentId;

	public Student(String name, int studentId) {
		super();
		this.name = name;
		this.studentId = studentId;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public int getStudentId() {
		return studentId;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", studentId=" + studentId + "]";
	}

}
