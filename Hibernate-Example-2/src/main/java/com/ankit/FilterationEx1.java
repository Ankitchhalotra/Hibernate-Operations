package com.ankit;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class FilterationEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = GetConfiguration.getSf().openSession();
		
		Criteria criteria = session.createCriteria(Student.class);
		Criterion cr2 = Restrictions.eq("rno", 103);
		criteria.add(cr2);
		//Criterion cr1 = Restrictions.gt("rno", 102);
		//criteria.add(cr1);
		
		List<Student> s = criteria.list();
		for(Student std : s) {
			System.out.print(std.getRno()+"  ");
			System.out.print(std.getName()+"  ");
			System.out.print(std.getDept()+"  ");
			System.out.print(std.getCollege());
			System.out.println();
		}
	}

}
