package io.vpv.hibernatedemo.service;

import io.vpv.hibernatedemo.HibernateDemoApplicationTests;
import io.vpv.hibernatedemo.model.Department;
import io.vpv.hibernatedemo.model.Employee;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class EmployeeServiceTest extends HibernateDemoApplicationTests {

    final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void findEmployeeById() {
        Employee emp = employeeService.findEmployeeById("1").orElse(null);
        logger.info("Employee: " + emp);
    }

    @Test
    public void findDepartmentById() {
        Department dept = employeeService.findDepartmentById("1").orElse(null);
        logger.info("Department: " + dept);
    }

    @Test
    public void findAllDepartment() {
        List<Department> departments = employeeService.findAllDepartment();
        departments.stream().map(i -> i.toString()).forEach(logger::info);
    }

    @Test
    public void findAllEmployee() {
        List<Employee> employees = employeeService.findAllEmployee();
        employees.stream().map(i -> i.toString()).forEach(logger::info);
    }
}