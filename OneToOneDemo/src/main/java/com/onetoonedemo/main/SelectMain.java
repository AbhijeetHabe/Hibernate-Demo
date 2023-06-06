package com.onetoonedemo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.onetoonedemo.pojo.Employee;

public class SelectMain {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Employee emp = (Employee) s.get(Employee.class, 1233);
		
		System.out.println(emp.getEmpId()+" : "+emp.getEmpName());
		
		sf.close();

	}
}
