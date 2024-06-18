package com.ankit;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class FilterationExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration();
		config.configure();
		
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		Criteria cr = session.createCriteria(Student.class);
		
		Criterion crt = Restrictions.between("rno", 102, 105);
		cr.add(crt);
		
		List<Student> list = cr.list();
		
		for(Student obj : list) {
			System.out.println(obj);
		}
		session.close();
	}

}
