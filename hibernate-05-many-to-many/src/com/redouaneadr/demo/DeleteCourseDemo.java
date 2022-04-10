package com.redouaneadr.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.redouaneadr.demo.entity.Course;
import com.redouaneadr.demo.entity.Instructor;
import com.redouaneadr.demo.entity.InstructorDetail;
import com.redouaneadr.demo.entity.Review;
import com.redouaneadr.demo.entity.Student;


public class DeleteCourseDemo {

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

			
			// get the course from db
			int courseId = 14;
			Course tempCourse = session.get(Course.class, courseId);
			
			// delete the course
			
			System.out.println("\nDeleting the course: " + tempCourse );
			session.delete(tempCourse);
		
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