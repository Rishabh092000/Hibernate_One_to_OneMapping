package Hibernate_OnetoOneMaping.Controller;

import Hibernate_OnetoOneMaping.dao.PassPortCrud;
import Hibernate_OnetoOneMaping.dto.PassPort;

public class PassPortController {
	   
	public static void main (String args []) {
		
		PassPortCrud crud1 = new PassPortCrud();
		
		PassPort pp = new PassPort("xyz", 4567876, "india", "598997");
		crud1.SavePassPortData(pp, 1);
		
		// update 
		
	/*	PassPort pp1 = new PassPort();
		pp1.setCountry("China");
		pp1.setName("Diya");
		pp1.setPass_Num(2345678);
		
		crud1.updatePassPortData(pp1);*/
		
		// delete 
		
	//	crud1.deletePassPortDataByID(1); 
		
		// fetch 
		
	//	crud1.FetchPassPortDataByID(2);
		
		
	}  
}
 