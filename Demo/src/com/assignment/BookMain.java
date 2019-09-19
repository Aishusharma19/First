package com.assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BookMain {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Demo1");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
//		Book b1=new Book(1,"Autobiography","1996-12-01","Nehru",4);
//		Book b2=new Book(2,"Arthashastra","1745-06-02","Kautilya",6);
//		Book b3=new Book(3,"Death of City","1997-11-19","Amrita Pritam",3);
//		Book b4=new Book(4,"Politics","1998-09-09","Aristole",1);
//		em.persist(b1);
//		em.persist(b2);
//		em.persist(b3);
//		em.persist(b4);
//	
		Book bt=em.find(Book.class, 2);
//		bt.setVersion(5);
//		
		em.remove(bt);
		
		
		et.commit();
		em.close();
		emf.close();
		
		
		

	}

}
