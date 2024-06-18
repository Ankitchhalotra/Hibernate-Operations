package com.ankit;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class StudentDisplayQBC1 {

	public static void main(String[] args) {
		
		Session session = GetConfiguration.getSf().openSession();
		
		Criteria criteria = session.createCriteria(Student.class);
		List<Student> student = criteria.list();
		
		for (Student std : student) {
			System.out.print(std.getRno()+"  ");
			System.out.print(std.getName()+"  ");
			System.out.print(std.getDept()+"  ");
			System.out.print(std.getCollege());
			System.out.println();
		}
		
		session.close();

	}

}
