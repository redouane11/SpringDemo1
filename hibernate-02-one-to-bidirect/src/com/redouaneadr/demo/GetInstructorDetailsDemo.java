package com.redouaneadr.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.redouaneadr.demo.entity.Instructor;
import com.redouaneadr.demo.entity.InstructorDetail;


public class GetInstructorDetailsDemo {

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
			
			// get the instuctordetail object
			
		
				int id = 4;
			
			InstructorDetail tempInstDetails = session.get(InstructorDetail.class, id);

			if(tempInstDetails !=null) {
				System.out.println("Instructor details: : " + tempInstDetails);
				
			}

			
			// print the associated  instructor
			
			System.out.println("Instructor : " + tempInstDetails.getInstructor());
			
			// save the instructor object ---> will also save the associated object "CASCADE"
			
			
			// Delete the instructor detail
			// remove the associated object reference
			//break bi-directional link
			System.out.println("Deleting the tempInstDetails: " + tempInstDetails);
			tempInstDetails.getInstructor().setInstructorDetail(null);
			session.delete(tempInstDetails);
			
			
			// commit transaction			
			session.getTransaction().commit();
			
			System.out.println("Done!");
			 
				
			
				
			//	print the instructor  detail
			
		} catch(NullPointerException e) {
			System.out.println("error: "+ e.getMessage());
			e.printStackTrace();
			//System.exit(1);
		}
		finally {
			// handle connection leak issue
			session.close();
			factory.close();
		}
	}

}