package com.ankit;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class AggregationExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = GetConfiguration.getSf().openSession();
		
		Criteria cr = session.createCriteria(Student.class);
		
		Projection proj = Projections.max("rno");
		cr.setProjection(proj);
		
		Integer res =(Integer) cr.uniqueResult();
		System.out.println(res);
		session.close();
		

	}

}
