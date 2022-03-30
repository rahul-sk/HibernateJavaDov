package com.db.hbnate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.db.hbnate.entity.Student;

public class ReadStudentDemo {
	public static void main(String args[]) {
		SessionFactory ff= new Configuration().configure("hibernate.cfg.xml").
				                 addAnnotatedClass(Student.class).buildSessionFactory();
		Session s=ff.getCurrentSession();
		try {
		System.out.println("Creating a new student object");
		
		
		Student ss1=new Student("Anush","jug","jiggy@gmail.com");
		Student ss2=new Student("nish","deg","ghh@gmail.com");
		Student ss3=new Student("nikk","jfg","yyy@gmail.com");
		s.beginTransaction();
		
		System.out.println("Saving the student object");
		s.save(ss1);
		s.save(ss2);
		s.save(ss3);
		
		s.getTransaction().commit();
		System.out.println("Done");
		}finally {
			ff.close();
		}
		
		
	}

}
