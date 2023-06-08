package com.hibernatemanytomany.pojo;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student{
	
	@Id
	@Column(name="id")
	private int studentId;
	
	@Column(name="name")
	private String studentName;
	
	@ManyToMany
	@JoinTable(name = "stud_course" , 
	joinColumns = @JoinColumn(name="stud_id" , 
	referencedColumnName = "id") , 
	inverseJoinColumns = @JoinColumn(name = "course_id" , 
	referencedColumnName = "id"))
	private Set<Course> courses;
	
	public Student() {
		
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studentId == other.studentId;
	}
	
	@Override
	public String toString() {
		return studentId + " : " + studentName;
	}
	
	
	
}
