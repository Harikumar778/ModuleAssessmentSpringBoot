//Use Case ----> 1

package com.harry.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harry.employee.beans.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
