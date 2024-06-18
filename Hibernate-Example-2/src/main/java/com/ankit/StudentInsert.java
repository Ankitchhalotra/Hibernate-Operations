package com.ankit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentInsert {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		//config.addAnnotatedClass(Student.class);    //jab without xml main entry ke chalana ho
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tr = session.beginTransaction();
		
		session.save(new Student(101,"Aman","CS","CDGI",50000));
		session.save(new Student(102,"Deep","RT","MGM",55000));
		session.save(new Student(103,"Tar","IT","SDBC",60000));
		session.save(new Student(104,"Amit","CSE","CDGI",50000));
		session.save(new Student(105,"Deepak","BXRT","MGM",55000));
		session.save(new Student(106,"Tarun","IT","SDBC",60000));
		session.save(new Student(107,"Sagar","ME","DAVV",30000));
		
		tr.commit();
		session.close();
		
		System.out.print("Data Inserted.............");

	}

}
