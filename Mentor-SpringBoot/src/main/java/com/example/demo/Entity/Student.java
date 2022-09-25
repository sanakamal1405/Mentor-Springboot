package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Serial_no;
	
	private int Roll_no;
	
	private String Name;
	
	private String Date_of_Submission;
	
	private String Subject;
	
	private int Marks;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSerial_no() {
		return Serial_no;
	}

	public void setSerial_no(int serial_no) {
		Serial_no = serial_no;
	}

	public int getRoll_no() {
		return Roll_no;
	}

	public void setRoll_no(int roll_no) {
		Roll_no = roll_no;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDate_of_Submission() {
		return Date_of_Submission;
	}

	public void setDate_of_Submission(String date_of_Submission) {
		Date_of_Submission = date_of_Submission;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}


	@Override
	public String toString() {
		return "Student [Serial_no=" + Serial_no + ", Roll_no=" + Roll_no + ", Name=" + Name + ", Date_of_Submission="
				+ Date_of_Submission + ", Subject=" + Subject + ", Marks=" + Marks
				+ "]";
	}
	
	
	

}
