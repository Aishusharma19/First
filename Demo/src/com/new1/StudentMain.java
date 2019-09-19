package com.new1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentMain {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Demo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Student s1=new Student(1,"Ramu",54);
		Student s2=new Student(2,"Ramya",74);
		Student s3=new Student(3,"Ramyakrishna",84);
		Student s4=new Student(4,"krishna",44);
		Student s5=new Student(5,"Achuthakrishna",64);
		Student s6=new Student(6,"Preethikrishna",44);
		Student st=em.find(Student.class,2);
		st.setMark(50);
		em.remove(st);
		
		
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);
		em.persist(s5);
		em.persist(s6);
		
		
		et.commit();
		em.close();
		emf.close();
		
		
		

	}

}
