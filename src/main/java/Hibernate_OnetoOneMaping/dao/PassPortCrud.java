package Hibernate_OnetoOneMaping.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Hibernate_OnetoOneMaping.dto.PassPort;
import Hibernate_OnetoOneMaping.dto.Person;

public class PassPortCrud {
	
	
EntityManagerFactory emf = Persistence.createEntityManagerFactory("VEER");
	
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	
	// Save 
	 public void SavePassPortData(PassPort pass, int per_Id)
	 {
		 
		 Person db = em.find(Person.class, per_Id);
		 et.begin();
		 em.persist(pass);
		 db.setPassPort(pass);
		 em.merge(db);
		 et.commit();
	 } 
		 
		 // update 
		 
		public void updatePassPortData(PassPort passport) 
		{
			PassPort db = em.find(PassPort.class, passport.getId() );
			et.begin();
			em.merge(passport);
			et.commit();
		}
		
		// delete 
		 
		public void deletePassPortDataByID(int id) 
		{
			PassPort db = em.find(PassPort.class, id );
			et.begin();
			em.merge(db);
			et.commit();
		}
		
		//  fetch 
		 
		public void FetchPassPortDataByID(int id) {
			PassPort db = em.find(PassPort.class, id);
			if(db!=null) {
				System.out.println(db);
			}
			
		}
		
	 }
	



