package com.hbnate_job.demo;

import com.hbnate_job.entity.Course;
import com.hbnate_job.entity.Review;
import com.hbnate_job.entity.instructor;

import com.hbnate_job.entity.instructorDetail;
import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class instructorDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(instructor.class).addAnnotatedClass(instructorDetail.class).addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).buildSessionFactory();
//		instructor ir=new instructor("Rahul","Koimattur","rsk@gmail.com");
//		instructorDetail id=new instructorDetail("youtube.com/rsk","Swimming and coding");
//		ir.setIstrDetail(id);
//		Course co=new Course("Startup 101");
//		Review r1=new Review("Best course abt startup");
//		Review r2=new Review("Nice");
//		Review r3=new Review("Lack of proper communication");
//		ir.add(co);
//		co.addReview(r1);
//		co.addReview(r2);
//
//		co.addReview(r3);
//		sn.save(co);
//		sn.save(ir);
		Session sn=sf.getCurrentSession();
		try {
			sn.beginTransaction();
//			
		    instructor itr=sn.get(instructor.class, 1);
		    System.out.println("Instructor named "+itr.getFirstName()+" Teaches "+itr.getCourses().size()+" Courses which are as follows ");
//		    System.out.println(itr.getCourses());
//		    System.out.println("The reviews for the above courses are");
//		    System.out.println(itr.getCourses().get(0).getReviews());
			
//			Course co=new Course("Startup 101");
			
			

		 
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
