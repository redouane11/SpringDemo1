package com.redouaneadr.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.redouaneadr.demo.entity.Course;
import com.redouaneadr.demo.entity.Instructor;
import com.redouaneadr.demo.entity.InstructorDetail;


public class FetchJoinDemo {

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

			
			// option 2: Hibernate query with HQL
			int theId = 1;
			Query<Instructor>  query = session.createQuery("""
					select i from Instructor i
					join fetch i.courses
					where i.id= :theInstructorId
					""", Instructor.class);
			
			// set parameter on query
			
			query.setParameter("theInstructorId", theId);
			
			
			
			// execute query and get Instructor
			Instructor tempInstr = query.getSingleResult();
			System.out.println("Fetching from db ..." );

			System.out.println("Instructor: " + tempInstr);
			
			
			
			// commit transaction
			session.getTransaction().commit();
			// close session
			
			session.close();
			System.out.println("\nThe Session is Closed...\n" ); 
			
			// get Courses
			System.out.println("courses: " + tempInstr.getCourses());
			System.out.println("Done!");
		}
		finally {
			
			// asd clean up code
			session.close();
			factory.close();
		}
	}

}