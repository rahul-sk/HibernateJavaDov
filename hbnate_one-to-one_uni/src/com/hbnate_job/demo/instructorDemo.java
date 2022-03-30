package com.hbnate_job.demo;

import com.hbnate_job.entity.instructor;
import com.hbnate_job.entity.instructorDetail;
import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class instructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(instructor.class).addAnnotatedClass(instructorDetail.class).buildSessionFactory();
		
//		instructor istr=new instructor("Rahul","Koimattur","rkoimattur@gmail.com");
//		instructorDetail idl=new instructorDetail("https://www.youtube.com/channel/UCUF4q_syTR7gyABO5S0mkNA","Swimming");
		
//		instructor istr=new instructor("Rohan","Koimattur","beth@gmail.com");
//		instructorDetail idl=new instructorDetail("https://www.youtube.com/channel/bethawker","Gymming");
		Session sn=sf.getCurrentSession();
		try {
			
			sn.beginTransaction();
			instructorDetail idt=sn.get(instructorDetail.class, 2);
			
			

			sn.delete(idt);

	
			sn.getTransaction().commit();
			
		}catch(Exception e){
			System.out.println("Inside the catch block");
			e.printStackTrace();
			System.out.println("Exiting the catch block");
		}
		
		finally {
			sn.close();
			sf.close();
		}
		

	}

}
