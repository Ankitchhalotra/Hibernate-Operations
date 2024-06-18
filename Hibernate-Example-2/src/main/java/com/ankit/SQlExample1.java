package com.ankit;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SQlExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = GetConfiguration.getSf().openSession();
		
      String sql ="select * from Student";
      
      SQLQuery sQuery = session.createSQLQuery(sql);
      List<Object[]> list = sQuery.list();
      
      for(Object ibj[]: list) {
		    for (Object obj : ibj) {
		        System.out.println(obj);
		    }
		    System.out.println("----------------------------");
		}
		session.close();

	}

}
