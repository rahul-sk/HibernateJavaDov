package com.db.hbnate;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.db.hbnate.entity.Student;

public class Rahulsexp {
	public static void main(String args[]) {
		SessionFactory sf= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session sn=sf.getCurrentSession();
		try {

			
//			sn.beginTransaction();
////			Student pam=sn.get(Student.class,2000);
////			pam.setFirstName("Pamella");
//			sn.createQuery("update Student set email='rkoimattur@icloud.com'").executeUpdate();
//			sn.getTransaction().commit();
			sn.beginTransaction();
			List<Student> studs=sn.createQuery("from Student where firstName like '%t'").getResultList();
            System.out.println("The ending with t names are.... "+studs.size());
            sn.getTransaction().commit();
		}finally {
			sf.close();
		}
	}

	private static void printStud(List<Student> lis) {
		for(Student ss:lis) {
			System.out.println(ss);
		}
	}
}
