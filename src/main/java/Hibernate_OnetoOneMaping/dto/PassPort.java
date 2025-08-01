package Hibernate_OnetoOneMaping.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class PassPort {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	// @Column(unique = true)
	private long pass_Num;
	private String country;
	private String Validity;

	public PassPort() {

	}

	/**
	 * @param id
	 * @param name
	 * @param pass_Num
	 * @param country
	 * @param validity
	 */
	
	public PassPort( String name, long pass_Num, String country, String validity) {
		super();
		
		this.name = name;
		this.pass_Num = pass_Num;
		this.country = country;
		Validity = validity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPass_Num() {
		return pass_Num;
	}

	public void setPass_Num(long pass_Num) {
		this.pass_Num = pass_Num;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getValidity() {
		return Validity;
	}

	public void setValidity(String validity) {
		Validity = validity;
	}

	@Override
	public String toString() {
		return "PassPort [id=" + id + ", name=" + name + ", pass_Num=" + pass_Num + ", country=" + country
				+ ", Validity=" + Validity + "]";
	}

}
