package com.ankit;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class HQLExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Session session = GetConfiguration.getSf().openSession();
		
	    String hql = "from Student";
	    
	    Query query = session.createQuery(hql);
	    
	    List<Student> list = query.list() ;
	    
	    for(Student obj : list) {
				System.out.println(obj);
		}
		session.close();

	}

}
