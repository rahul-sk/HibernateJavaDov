package com.hbnate_job.demo;

import com.hbnate_job.entity.Job;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class jobCRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Job.class).buildSessionFactory();
		Session sn=sf.getCurrentSession();
		try {
//			Job jb1=new Job("jon","Kor","Google");
//			Job jb2=new Job("jack","Koimattur","Facebook");
//			Job jb3=new Job("patil","Koimattur","ibm");
//			Job jb4=new Job("pon","Koimattur","infosys");
			
			sn.beginTransaction();
			
//			sn.save(jb1);
//			sn.save(jb2);
//			sn.save(jb3);
//			sn.save(jb4);
//			Job rah=sn.get(Job.class, 1);
//			System.out.println("The name is "+rah.getFirstName() +" And he is the CEO of "+rah.getCompany());
            List<Job> ceos=sn.createQuery("from Job where company='koizo'").getResultList();
            for(Job jj:ceos) {
            	System.out.println(jj);
            }
			
			sn.getTransaction().commit();

			
			
			
		}finally {
			sf.close();
		}

	}

}
