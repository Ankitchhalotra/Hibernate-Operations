package com.ankit;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class OrderingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = GetConfiguration.getSf().openSession();
		Criteria cr = session.createCriteria(Student.class);
		
		Order order = Order.desc("rno");
		cr.addOrder(order);
		
		List<Student> obj = cr.list();
		
		for(Student ob:obj) {
			System.out.println(ob.getRno());
		}
		session.close();
	}

}
