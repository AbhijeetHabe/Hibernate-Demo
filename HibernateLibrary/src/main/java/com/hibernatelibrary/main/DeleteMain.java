package com.hibernatelibrary.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatelibrary.pojo.Book;

public class DeleteMain {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		int bookId = 1;
		
		Book book = (Book) s.get(Book.class, bookId);
		
		s.delete(book);
		
		tr.commit();
		System.out.println("Book saved");
		
		sf.close();

	}

}
