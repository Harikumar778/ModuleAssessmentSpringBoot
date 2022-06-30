// Use Case ---> 1


package com.harry.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.harry.employee.beans.Employee;
import com.harry.employee.dao.EmployeeDao;


@RestController
public class EmployeeController {

	@Autowired
	EmployeeDao empdao;
	
//	getemployees data 
	
	@RequestMapping("/getemployees")
	List<Employee> getEmpdata(){
		List<Employee> empList=empdao.findAll();
		return empList;
	}
	
// Update employee data
	
	@PostMapping("/addemp")
	void addEmployee(@RequestBody Employee emp) {
		empdao.save(emp);
		System.out.println(emp);
		
	}
	
// Get employee by id
	
	@RequestMapping("/getemp")
	Employee getEmpdataById(int id) {
		Employee emp= empdao.getById(id);
		return emp;
	}
	
//	delete Employee by id
	
	@RequestMapping("/delemp")
	void delemployee(@RequestParam("eid") int id) {
		Employee emp= getEmpdataById(id);
		empdao.delete(emp);		
		
		
	}
	

}
