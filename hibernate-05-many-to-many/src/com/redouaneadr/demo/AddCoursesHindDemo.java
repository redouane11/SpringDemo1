package com.redouaneadr.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.redouaneadr.demo.entity.Course;
import com.redouaneadr.demo.entity.Instructor;
import com.redouaneadr.demo.entity.InstructorDetail;
import com.redouaneadr.demo.entity.Review;
import com.redouaneadr.demo.entity.Student;


public class AddCoursesHindDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Student.class)
								.addAnnotatedClass(Review.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {	
			
			
			// start a transaction
			session.beginTransaction();

			
			// get student Hind from db
			int sudentId = 1;
			Student tempStudent = session.get(Student.class, sudentId);
			System.out.println("\nLoaded student: " + tempStudent );
			System.out.println(" Courses of this student: " + tempStudent.getCourses() );
			// create more courses
			
			
			System.out.println("Creating Courses ..." );
			Course course1 = new Course("MERN: Full stack dev");
			Course course2 = new Course("Socket.io with Reactjs");
			
			// add student to the courses
			course1.addStudent(tempStudent);
			course2.addStudent(tempStudent);
			// save the courses 
			System.out.println("Saving the Courses..." );
			session.save(course1);
			session.save(course2);
			
			
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			
			// asd clean up code
			session.close();
			factory.close();
		}
	}

}