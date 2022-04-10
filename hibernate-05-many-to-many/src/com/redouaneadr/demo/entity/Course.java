package com.redouaneadr.demo.entity;

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
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	//define our fields
	
	
	// define constructors
	
	
	// define getters/setters
	
	
	// define toString
	
	
	// annotate fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@ManyToOne(cascade= {CascadeType.PERSIST,
						 CascadeType.DETACH,
						 CascadeType.MERGE,
						 CascadeType.REFRESH})
	@JoinColumn(name="instructor_id")
	private Instructor theInstructor;
	
	@OneToMany(fetch=FetchType.LAZY,
				cascade=CascadeType.ALL)
	@JoinColumn(name="course_id")
	private List<Review> reviews;
	
	@ManyToMany(fetch=FetchType.LAZY,
				cascade= {CascadeType.PERSIST,
						  CascadeType.MERGE,
						  CascadeType.DETACH,
						  CascadeType.REFRESH})
	@JoinTable(
			name="course_student",
			joinColumns=@JoinColumn(name="course_id"),
			inverseJoinColumns=@JoinColumn(name="student_id")
			)
	
	private List<Student> students;
	private Course() {
		
	}


	public Course(String title) {
		this.title = title;
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


	public Instructor getInstructor() {
		return theInstructor;
	}


	public void setInstructor(Instructor instructor) {
		theInstructor = instructor;
	}


	public List<Review> getReviews() {
		return reviews;
	}


	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	// add a convenience method
	public void addReview(Review theReview) {
		if(reviews == null) {
			reviews = new ArrayList<>();
		}
		
		reviews.add(theReview);
	}
	
	public List<Student> getSetudents() {
		return students;
	}


	public void setSetudents(List<Student> setudents) {
		this.students = setudents;
	}

	// add a convenience method
	public void addStudent(Student theStudent) {
		if(students == null) {
			students = new ArrayList<>();
		}
		students.add(theStudent);
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}
	
	
	
	
	
}
