package com.hibernateonetomany.main;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernateonetomany.pojo.Customer;
import com.hibernateonetomany.pojo.Order;

public class SelectMain {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		Customer c = (Customer) s.get(Customer.class, 1233);
		
		System.out.println(c.getCustomerId() + " : " + c.getCustomerName());
		

		Set<Order> oset=c.getOrders();
		oset.forEach(System.out::println);
		
		tr.commit();
				
		sf.close();

	}

}
