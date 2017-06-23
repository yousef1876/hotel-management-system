package com.application.hotel.employee.security.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.application.hotel.employee.model.Employee;

@Entity
@Table(name = "employee_role")
public class EmployeeRole extends Employee{

	@Column(name = "role_name" , nullable = false)
	private String roleName;
	
	@Column(name = "description" , nullable = true)
	private String description;
	
	@Column(name = "notes" , nullable = true)
	private String notes;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
}
