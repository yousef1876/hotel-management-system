package com.application.hotel.employee.security.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.application.hotel.employee.model.Employee;
import com.application.hotel.employee.model.EmployeeAttendance;
import com.application.hotel.employee.model.EmployeeEducation;
import com.application.hotel.employee.model.EmployeeExpereince;
import com.application.hotel.employee.model.EmployeeInsurance;
import com.application.hotel.employee.model.EmployeeLeave;



@Entity
@Table(name = "employee_users")
public class EmployeeUser  {
	
	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id" , nullable = false)
	private Employee employees;
	
	@Column(name = "username" , nullable = false)
	private String username;
	
	@Column(name = "password" , nullable = false)
	private String password;
	
	@Column(name = "enabled" , nullable = false)
	private boolean enabled;
	
	@Column(name = "notes" , nullable = false)
	private String notes;
	
	@Column(name = "description" , nullable = false)
	private String description;

	
	
	
}
