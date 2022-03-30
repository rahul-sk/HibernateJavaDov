package com.hbnate_job.entity;
import java.util.ArrayList;

import java.util.List;

import javax.persistence.CascadeType;



import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int id;
	
	@Column(name="title")
	private String title;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="instructor_id")
	private instructor instr;
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="course_id")
	private List<Review> reviews; 
	
	@ManyToMany(fetch=FetchType.LAZY,cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(
    		name="course_student",
    		joinColumns=@JoinColumn(name="course_id"),
    		inverseJoinColumns=@JoinColumn(name="student_id"))
	
	private List<Student> students;
	
	public Course() {
		
	}

	public Course(String title) {
		this.title = title;
	}
	
	

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public instructor getInstr() {
		return instr;
	}

	public void setInstr(instructor instr) {
		this.instr = instr;
	}
	
	

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}
	
	public void addReview(Review r) {
		if(reviews==null) {
			reviews=new ArrayList<>();
		}
		reviews.add(r);
	}
	
	public void addStudent(Student std) {
		if(students==null) {
			students=new ArrayList<>();
		}
		students.add(std);
	}
	
	

}
