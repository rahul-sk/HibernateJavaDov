package com.hbnate_job.demo;

import com.hbnate_job.entity.Course;
import com.hbnate_job.entity.Review;
import com.hbnate_job.entity.Student;
import com.hbnate_job.entity.instructor;

import com.hbnate_job.entity.instructorDetail;
import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;
import org.hibernate.query.Query;

public class instructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(instructor.class).addAnnotatedClass(instructorDetail.class).addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).addAnnotatedClass(Student.class).buildSessionFactory();
//		instructor ir=new instructor("Rahul","Koimattur","rsk@gmail.com");
//		instructorDetail id=new instructorDetail("youtube.com/rsk","Swimming and coding");
//		ir.setIstrDetail(id);
//		

//		sn.save(co);
//		sn.save(ir);
		Session sn=sf.getCurrentSession();
		
		try {

			sn.beginTransaction();
			
//			Course co=new Course("Startup 101");

//             co.addStudent(s1);
//             co.addStudent(s2);
//             co.addStudent(s3);
//             sn.save(co);
			
//			System.out.println("Saving the course");
//			sn.save(co);
//            Student s1=new Student("rahul","koi","koi@yahoo.in");
//            Student s2=new Student("rohan","koi","koi@yahoo.in");
//
//            Student s3=new Student("aaroh","jug","jug@icloud.com");
//            co.addStudent(s1);
//            co.addStudent(s2);
//            co.addStudent(s3);
//            
//            System.out.println("Saving the students");
//            sn.save(s1);
//            sn.save(s2);
//            sn.save(s3);
//            
//			System.out.println("The saved students are "+co.getStudents());
//			Student rah=sn.get(Student.class, 1);
//			sn.delete(rah);
//			Course c1=new Course("Python programming");
//			Course c2=new Course("JavaScript programming");
//			
//			 c1.addStudent(rah);
//			 c2.addStudent(rah);
//			 
//			 sn.save(c1);
//			 sn.save(c2);
//			 System.out.println("After courses for rahul");
//			 System.out.println(rah.getCourses());
			
			Course so=sn.get(Course.class, 11);
	
			sn.delete(so);

			


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
