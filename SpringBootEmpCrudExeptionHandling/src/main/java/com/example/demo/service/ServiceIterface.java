package com.example.demo.service;

import java.util.List;

import com.example.demo.entites.Employee;

public interface ServiceIterface {

	Employee EmployeeCreation(Employee emp);

	Employee getEmployeeById(int id);

	List<Employee> getAllEmployee();

	String delete(int id);

	String UpdateEmployee(Employee emp);

}
