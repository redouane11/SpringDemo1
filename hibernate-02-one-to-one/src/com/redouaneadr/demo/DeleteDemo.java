package com.redouaneadr.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.redouaneadr.demo.entity.Instructor;
import com.redouaneadr.demo.entity.InstructorDetail;


public class DeleteDemo {

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
			
			// start a transaction
			session.beginTransaction();
			
			// get instuctor by primary key / id the objects
			int id = 2;
			Instructor tempInst = session.get(Instructor.class, id);
			
					//							,"Soccer");
			
			

			
			// delete the instructor
			if(tempInst !=null) {
				System.out.println("Deleting: " + tempInst);
				
				session.delete(tempInst);
			}
			
			// save the instructor object ---> will also save the associated object "CASCADE"
			
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}