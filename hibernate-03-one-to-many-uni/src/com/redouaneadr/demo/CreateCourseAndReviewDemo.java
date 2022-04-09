package com.redouaneadr.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.redouaneadr.demo.entity.Course;
import com.redouaneadr.demo.entity.Instructor;
import com.redouaneadr.demo.entity.InstructorDetail;


public class CreateCourseAndReviewDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {	
			
			
			// start a transaction
			session.beginTransaction();

			// get the instructor from db
			int theId = 1;
			Instructor tempInstr = session.get(Instructor.class, theId);
			
			// create some courses
			
			System.out.println("Creating Courses ..." );
			Course course1 = new Course("Design patterns");
			Course course2 = new Course("Raspberry Pi4");
			Course course3 = new Course("Hibernate and Spring");
			
			// add courses to instructor
			System.out.println("Adding the courses to the Instructor ..." );
			tempInstr.add(course1);
			tempInstr.add(course2);
			tempInstr.add(course3);
			
			
			// save the courses object ---> will also save the associated object "CASCADE"
			System.out.println("Saving the Courses..." );
			session.save(course1);
			session.save(course2);
			session.save(course3);
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