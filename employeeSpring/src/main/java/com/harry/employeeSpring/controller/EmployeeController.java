//Use Case ----> 2
package com.harry.employeeSpring.controller;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import com.harry.employeeSpring.beans.Employee;

@Controller
public class EmployeeController {
	

	@RequestMapping("/register")
	ModelAndView m2() {
		ModelAndView mv=new ModelAndView("WEB-INF/register.jsp");
		Employee employee=new Employee();
		mv.addObject("emp", employee);
		return mv;
	
	
	}
	
	@PostMapping("/adduser")
	String saveData(@ModelAttribute("emp") Employee emp) {
		System.out.println(emp);
		RestTemplate restTemplate=new RestTemplate();
        HttpEntity<Employee> entity=new HttpEntity<Employee>(emp);
        restTemplate.postForObject("http://localhost:4040/addemp", entity, String.class);
        return "showProduct.jsp";
	}
}
