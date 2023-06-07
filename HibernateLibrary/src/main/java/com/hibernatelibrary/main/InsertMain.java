package com.hibernatelibrary.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatelibrary.pojo.Book;


public class InsertMain {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		Book book = new Book();
		
		book.setBookId(2);
		book.setAuthor("Ratan Tata");
		book.setCategory("Business");
		book.setPrice(250);
		book.setPublication("Indian Publ.");
		book.setStatus("Available");
		book.setTitle("Tata Industries");
		
		s.save(book);
		
		tr.commit();
		System.out.println("Book saved");
		
		sf.close();
	}

}
