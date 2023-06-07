package com.hibernatelibrary.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatelibrary.pojo.Book;

public class DisplayMain {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		int bookId = 2;
		
		Book book = (Book) s.get(Book.class, bookId);
		
		System.out.println(book.getBookId());
		System.out.println(book.getAuthor());
		System.out.println(book.getCategory());
		System.out.println(book.getPrice());
		System.out.println(book.getPublication());
		System.out.println(book.getStatus());
		System.out.println(book.getTitle());
		
		List<Book> book1 = s.createQuery("FROM Book").list();
		
		for (Book books: book1) {
			System.out.println(books);
		}
		
		
		tr.commit();
		System.out.println("Book saved");
		
		sf.close();

	}

}
