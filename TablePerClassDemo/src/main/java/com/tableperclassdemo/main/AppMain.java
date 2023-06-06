package com.tableperclassdemo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tableperclassdemo.pojo.*;

public class AppMain {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		TwoWheeler tw = new TwoWheeler();
		tw.setVehicleId(201);
		tw.setHandle_type("straight");
		tw.setSeating_capacity(2);
		
		FourWheeler fw = new FourWheeler();
		fw.setVehicleId(101);
		fw.setSeating_capacity(5);
		fw.setSteering_type("power");
		
		s.save(tw);
		s.save(fw);
		
		tr.commit();
		System.out.println("Vehicles saved");
		
		sf.close();
	}

}
