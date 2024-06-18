package com.ankit;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class Faltu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config = new Configuration();
		//config.addAnnotatedClass(Student.class);
		config.configure();
		
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		Criteria cr = session.createCriteria(Student.class);
		Projection proj = Projections.sum("rno");
		cr.setProjection(proj);
		Long sum = (Long)cr.uniqueResult();
		System.out.println(sum);
		
//		Projection pro = Projections.property("name");
//		Projection pro1 = Projections.property("rno");
//		ProjectionList pl = Projections.projectionList();
//		pl.add(pro);
//		pl.add(pro1);
//		cr.setProjection(pl);
//		
//		List<Object[]> list = cr.list();
//		
//		for(Object[] ob : list) {
//			for(Object ob1 : ob) {
//		       System.out.print(ob1);
//			}
//			System.out.println();
//		}
		
		
//		Criterion crt = Restrictions.gt("rno", 103);
//		Criterion crt1 = Restrictions.lt("rno", 105);
//		cr.add(crt);
//		cr.add(crt1);
//		List<Student> list = cr.list();
//		System.out.println(list);
		
		
		
//		Order order = Order.desc("rno");
//		cr.addOrder(order);
//		List<Student> list = cr.list();
//		for(Student s : list)
//		System.out.println(s);
		
		
		
//		Student s = session.get(Student.class, 101);
//		System.out.println(s);
		
		session.close();
	}

}
