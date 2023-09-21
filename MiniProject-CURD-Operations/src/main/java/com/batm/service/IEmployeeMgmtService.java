//IEmployeeMgmtService.java
package com.batm.service;

import java.util.List;

import com.batm.entity.Employee;

public interface IEmployeeMgmtService {
	
	public List<Employee> getAllEmployeeData();
	public String registerEmployee(Employee emp);
	public Employee getEmployeeById(int eno);
	public String updateEmployee(Employee emp);
	public String deleteEmployeeById(int id);

}//interface
