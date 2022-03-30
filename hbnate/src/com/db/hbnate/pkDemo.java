package com.db.hbnate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.db.hbnate.entity.Student;

public class pkDemo {
	public static void main(String args[]) {
		SessionFactory ff= new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student.class).buildSessionFactory();
Session s=ff.getCurrentSession();
try {
//System.out.println("Creating a new student object");
//
//
//Student ss1=new Student("pam","jg","jggy@gmail.com");
//Student ss2=new Student("jim","dg","hh@gmail.com");
//Student ss3=new Student("dwight","jg","yy@gmail.com");
//
//s.beginTransaction();
//
//System.out.println("Saving the student object");
//s.save(ss1);
//s.save(ss2);
//s.save(ss3);
//
//s.getTransaction().commit();
	s.beginTransaction();
	
	Student pam=s.get(Student.class,2000);
//	System.out.println("Pam's name is "+pam.getFirstName());
//	System.out.println("Pam's email is "+pam.getEmail());
//	System.out.println("Pams ID is" +pam.getId());
	System.out.println(pam);
	s.getTransaction().commit();

System.out.println("Done");
}finally {
ff.close();
}


	}

}
