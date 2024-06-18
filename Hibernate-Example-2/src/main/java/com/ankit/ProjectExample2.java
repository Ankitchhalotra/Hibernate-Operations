package com.ankit;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class ProjectExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = GetConfiguration.getSf().openSession();
		
		Criteria cr = session.createCriteria(Student.class);
		
		Projection proj1 = Projections.property("rno");
		Projection proj2 = Projections.property("name");
		
		
		ProjectionList pList = Projections.projectionList();
		pList.add(proj1);
		pList.add(proj2);
		cr.setProjection(pList);
		
		List<Object[]> list = cr.list();
		
		for(Object ob1[] : list) {
			for(Object ob:ob1) {
			System.out.print(ob+"  ");
			}
			System.out.println();
		}
		session.close();

	}

}
