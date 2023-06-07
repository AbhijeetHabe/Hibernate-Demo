package com.hibernatelibrary.main;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatelibrary.pojo.Book;

public class UpdateMain {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		int bookId = 1;
		
		Book book = (Book) s.get(Book.class, bookId);
		
		book.setAuthor("Ratan Tata");
		book.setTitle("Tata Industries");
		
		s.update(book);
		
		tr.commit();
		System.out.println("Book saved");
		
		sf.close();
	}

}
