package com.redouaneadr.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.redouaneadr.demo.entity.Instructor;
import com.redouaneadr.demo.entity.InstructorDetail;


public class CreateDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			// create the objects
					//							,"Soccer");
			
			
			Instructor tempInst = new Instructor("Ilyas", "Adriouch", "ilyas@hotmail.com");
			
			InstructorDetail temInstDetail = new InstructorDetail("https://www.karate.com/youtube"
																	,"Karate");
			
			// associate the objects
			tempInst.setInstructorDetail(temInstDetail);
			
			// start a transaction
			session.beginTransaction();
			
			// save the instructor object ---> will also save the associated object "CASCADE"
			System.out.println("Saving the Instructor..." + tempInst.toString());
			session.save(tempInst);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}