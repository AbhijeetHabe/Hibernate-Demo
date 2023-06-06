package com.singletabledemo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.singletabledemo.pojo.ContractEmployee;
import com.singletabledemo.pojo.NativeEmployee;

public class AppMain {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		NativeEmployee e1 = new NativeEmployee();
		e1.setEmpId(1);
		e1.setEmpName("Aniket");
		e1.setOffice_location("Mumbai");
		
		ContractEmployee e2 = new ContractEmployee();
		e2.setEmpId(2);
		e2.setEmpName("Mohit");
		e2.setSite_location("Pune");
		
		NativeEmployee e3 = new NativeEmployee();
		e3.setEmpId(3);
		e3.setEmpName("Pranav");
		e3.setOffice_location("Thane");
		
		s.save(e1);
		s.save(e2);
		s.save(e3);
		
		tr.commit();
		System.out.println("Employees saved");
		
		sf.close();
	}

}
