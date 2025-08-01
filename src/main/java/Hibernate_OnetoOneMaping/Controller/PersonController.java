package Hibernate_OnetoOneMaping.Controller;


import Hibernate_OnetoOneMaping.dao.PersonCrud;
import Hibernate_OnetoOneMaping.dto.Person;

public class PersonController {
     public static void main (String [] args) {
    	 
    	 // save 
    	 PersonCrud crud = new PersonCrud();
    	 Person p = new Person ("Aniket","Aniket@gmail.com", 789456, "mhow");
    	 crud.savePerson(p);
    	 
    	 
    	 // update 
//    	 Person p1 = new Person();
//    	 p1.setAddress("Indore");
//    	 p1.setName("sachin");
//    	 p1.setId(1);
//    	 
//    	  crud.updatePersonDate(p1);
//    	 
    	 // deleted 
    	// crud.deletePersonByID(1);                               
    	 // fetch 
    	 //crud.fetchPersonByID(2); 
    	 
     }
}
