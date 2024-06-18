package com.ankit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StudentDisplayQBI {

	public static void main(String[] args) {
		
		//Student std = new Student();
		
		SessionFactory sf = GetConfiguration.getSf();
		Session session = sf.openSession();
		
		Student std = session.get(Student.class,101);
		
		System.out.print(std.getRno()+"  ");
		System.out.print(std.getName()+"  ");
		System.out.print(std.getDept()+"  ");
		System.out.print(std.getCollege());
		
		session.close();

	}

}
