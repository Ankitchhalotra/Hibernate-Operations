package com.ankit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentDelete {

	public static void main(String[] args) {
		
		Student std = new Student();
		std.setRno(104);
		
		SessionFactory sf = GetConfiguration.getSf();
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		session.delete(std);
		tr.commit();
		session.close();
		
		System.out.print("Record Removed..........");
		

	}
}
