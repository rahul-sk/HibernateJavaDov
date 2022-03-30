package com.hbnate_job.demo;

import com.hbnate_job.entity.Course;

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
		
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(instructor.class).addAnnotatedClass(instructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();
		
//		instructor istr=new instructor("Paul","Smith","paul@gmail.com");
//		instructorDetail idl=new instructorDetail("https://www.youtube.com/channel/paul.smith","Painting");
//		istr.setIstrDetail(idl);
//		
//	Course c=new Course("Content creation 101");
//	Course c22=new Course("Java Programming");

		
//	
//		instructor istr=new instructor("Rohan","Koimattur","beth@gmail.com");
//		instructorDetail idl=new instructorDetail("https://www.youtube.com/channel/bethawker","Gymming");
		Session sn=sf.getCurrentSession();
		try {
			
			sn.beginTransaction();
			
			Course c1=new Course("Spring MVC With Wildfly");
			sn.save(c1);
			System.out.println("New Course saved");
			
			
			
//			
//            sn.save(istr);
//        sn.save(idl);
//			instructor ii=sn.get(instructor.class, 1);
//			ii.add(c);
//			ii.add(c2);
//			sn.save(c);
//			sn.save(c2);
//			System.out.println(ii.getFirstName()+" Teaches "+ii.getCourses().size()+" Courses which are as below : ");
//			for(Course co:ii.getCourses()) {
//				System.out.println(co.getTitle());
//			}
//			instructor it=sn.get(instructor.class, 1);
//			System.out.println("THe instructor me : "+it);
//			System.out.println("The courses he teaches me : "+it.getCourses());
//			Course c1=sn.get(Course.class, 10);
//			Course c2=sn.get(Course.class, 11);
//
//            System.out.println(c1.getTitle()+" is taught by "+c1.getInstr().getFirstName());
//            System.out.println(c2.getTitle()+" is taught by "+c2.getInstr().getFirstName());
			
//
//	
//			sn.getTransaction().commit();
//			sn.close();
//			System.out.println("Session is closed yo");
//			System.out.println("Opening new session");
//			sn=sf.getCurrentSession();
//sn.beginTransaction();
            
            // get courses for a given instructor
//int theId=1;
//            Query<Course> query = sn.createQuery("select c from Course c "
//                                                    + "where c.instr.id=:theInstructorId",    
//                                                    Course.class);
//            
//            query.setParameter("theInstructorId", theId);
//            
//            List<Course> tempCourses = query.getResultList();
//            
//            System.out.println("tempCourses me : " + tempCourses);
//            
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
