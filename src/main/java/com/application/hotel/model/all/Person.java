package com.application.hotel.model.all;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "person_info")
public class Person {

	
	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	@Column( name = "first_name" , nullable = false)
	private String firstName;
	
	@Column(name = "second_name" , nullable = true)
	private String secondName;
	
	@Column( name = "last_name" , nullable = false)
	private String lastName;
	
	@Column( name = "id_no" , nullable = false)
	private String idNo;
	
	@Column( name = "passport_no" , nullable = false)
	private String passportNo;

	@OneToMany(fetch = FetchType.LAZY , mappedBy = "persons")
	private List<CheckIn> persons;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "persons")
	private List<CheckOut> personCk;
	

	public List<CheckOut> getPersonCk() {
		return personCk;
	}

	public void setPersonCk(List<CheckOut> personCk) {
		this.personCk = personCk;
	}

	public List<CheckIn> getPersons() {
		return persons;
	}

	public void setPersons(List<CheckIn> persons) {
		this.persons = persons;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	
}
