package com.redouaneadr.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.redouaneadr.demo.entity.Course;
import com.redouaneadr.demo.entity.Instructor;
import com.redouaneadr.demo.entity.InstructorDetail;
import com.redouaneadr.demo.entity.Review;
import com.redouaneadr.demo.entity.Student;


public class CreateCoursesAndStudentsDemo {

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


			// create some courses
			
			System.out.println("Creating Courses ..." );
			Course course1 = new Course("Design patterns");
			Course course2 = new Course("Raspberry Pi4");
			Course course3 = new Course("Hibernate and Spring");
			
			// save the courses 
			System.out.println("Saving the Courses..." );
			session.save(course1);
			session.save(course2);
			session.save(course3);
			
			// create the students
			Student hind = new Student("Hind", "Regragui", "hind@email.com");
			Student celia = new Student("CElia", "Adriouch", "celia@email.com");
			
			// add students to the course
			course1.addStudent(celia);
			course1.addStudent(hind);
			course2.addStudent(celia);
			course3.addStudent(hind);
			// save the students
			System.out.println("Saving the Students ..." );
			session.save(hind);
			session.save(celia);
			System.out.println(" Details Celia..." + celia.getCourses() );
			System.out.println(" Details Hind..." + celia.getCourses() );
			
			
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