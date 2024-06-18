package com.ankit;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetConfiguration {
	
	public static SessionFactory getSf() {
		Configuration config = new Configuration();
		config.configure();
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		return sessionFactory;
	}

}
