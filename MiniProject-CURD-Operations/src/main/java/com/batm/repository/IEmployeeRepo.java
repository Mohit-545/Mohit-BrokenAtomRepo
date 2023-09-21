//IEmployeeRepo.java
package com.batm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batm.entity.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

}//interface
