package com.db.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user="hbstudent";
		String pass="hbstudent";
		
		try {
			System.out.println("Connecting to database "+url);
			Connection con=DriverManager.getConnection(url,user,pass);
			System.out.println("Connection success");
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
