//Use Case -----> 3

package com.harry.employee;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.harry.employee.beans.Employee;
import com.harry.employee.dao.EmployeeDao;

@SpringBootTest
class EmployeeApplicationTests {
	
	@Autowired
	EmployeeDao empdao;

	@Test
	void contextLoads() {
	}

	@Test
	void checkDaoObject() {
		  Assertions.assertNotEquals(empdao, null);
	}
	
	 void checkAddEmp()
	    {
	        Employee emp = new Employee("Sneha",350000,"Manager");

	        List<Employee> empList =  empdao.findAll();
	        System.out.println(empdao);
	        empdao.save(emp);
	        List<Employee> empList2 =  empdao.findAll();
	        Assertions.assertEquals(empList.size()+1, empList2.size());
	    }
	 
	 
	 @Test
	    void checkUpdateEmp()
	    {
	        List<Employee> empList;
	        Employee emp1;
	        empList=empdao.findAll();
	        emp1=empList.get(0);
	        String tempname=emp1.getEmpName();
	        emp1.setEmpName(emp1.getEmpName().concat("Paul"));
	        empdao.save(emp1);
	        Employee emp2=empdao.getById(emp1.getEmpId());
	        Assertions.assertNotEquals(tempname,emp2.getEmpName());
	    }
}
