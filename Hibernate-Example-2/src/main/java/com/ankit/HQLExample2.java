package com.ankit;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class HQLExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = GetConfiguration.getSf().openSession();
		
		String hql = "update Student set fees=fees-10000";
		Query query = session.createQuery(hql);
		
		Transaction tr = session.beginTransaction();
		
		int n = query.executeUpdate();
		tr.commit();
		
		System.out.println(n+" rows affected");
		session.close();
	}

}
