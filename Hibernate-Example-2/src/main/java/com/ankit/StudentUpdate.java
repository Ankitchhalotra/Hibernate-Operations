package com.ankit;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentUpdate {

	public static void main(String[] args) {
		
		Student std = new Student();
		std.setRno(103);
		std.setDept("EC");
		
		Session session = GetConfiguration.getSf().openSession();
		Transaction tr = session.beginTransaction();
		
		session.update(std);
		
		tr.commit();
		session.close();
		
		System.out.print("Recored Updated..........");

	}

}
