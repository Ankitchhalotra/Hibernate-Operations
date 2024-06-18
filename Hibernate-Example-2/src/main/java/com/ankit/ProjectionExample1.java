package com.ankit;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class ProjectionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = GetConfiguration.getSf().openSession();
		
		Criteria cr = session.createCriteria(Student.class);
		
		Projection proj = Projections.property("name");
		cr.setProjection(proj);
		
		List<String> list = cr.list();
		
		for(String std : list) {
			System.out.println(std);
		}
		
		session.close();

	}

}
