package com.application.hotel.employee.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hotel.employee.model.EmployeeInsurance;

@RepositoryRestResource(collectionResourceRel = "people_inssurance", path = "people_inssurance")
public interface EmployeeInssuranceRepo extends PagingAndSortingRepository<EmployeeInsurance, Long> {

	List<EmployeeInsurance> findByInsuranceNo(@Param("name") String name);
	
}