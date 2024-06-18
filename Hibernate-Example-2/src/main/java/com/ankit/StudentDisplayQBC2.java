package com.ankit;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class StudentDisplayQBC2 {
	
	public static void main(String args[]) {
		
		Session session = GetConfiguration.getSf().openSession();
		
		Criteria cr = session.createCriteria(Student.class);
		
		Order order = Order.asc("name");
		cr.addOrder(order);
		
		List<Student> stdudent = cr.list();
		
		for(Student std : stdudent) {
			System.out.print(std.getRno()+"  ");
			System.out.print(std.getName()+"  ");
			System.out.print(std.getDept()+"  ");
			System.out.print(std.getCollege());
			System.out.println();
		}
	}

}
