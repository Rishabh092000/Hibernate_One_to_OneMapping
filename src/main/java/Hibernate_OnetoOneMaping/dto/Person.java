package Hibernate_OnetoOneMaping.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;


@Entity
public class Person {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(unique = true)
	private String email;
	private long phone;
	private String address;
	/**
	 * 
	 */
	@OneToOne(cascade = CascadeType.ALL)
	private PassPort passPort;
	
	public Person() {
		super();
	}
	/**
	 * @param name
	 * @param email
	 * @param phone
	 * @param address
	 */
	public Person(String name, String email, long phone, String address) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public PassPort getPassPort() {
		return passPort;
	}
	public void setPassPort(PassPort passPort) {
		this.passPort = passPort;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address
				+ ", passPort=" + passPort + "]";
	}
	
		
	}
	
//    
	
	
	
	

