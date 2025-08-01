package Hibernate_OnetoOneMaping.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Hibernate_OnetoOneMaping.dto.Person;

public class PersonCrud {
	
EntityManagerFactory emf = Persistence.createEntityManagerFactory("VEER");
	
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	
	// save 
	
	public void savePerson(Person person) {
		et.begin();
		em.persist(person);
		et.commit();
		
	}
   // update
	
	public void updatePersonDate(Person person) {
		
	Person db = em.find(Person.class, person.getId());
		et.begin();
		em.merge(person);
		et.commit();
	
	}
	// delete 
	
	public void deletePersonByID(int id) {
		
		Person db = em.find(Person.class,id);
			et.begin();
			em.remove(db);
			et.commit();
}
	
	// fetch
	public void fetchPersonByID(int id) {
		
		Person db = em.find(Person.class, id);
			if(db!=null) {
				System.out.println(db);
			}
}
}
