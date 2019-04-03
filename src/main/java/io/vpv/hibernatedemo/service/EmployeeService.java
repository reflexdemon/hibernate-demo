package io.vpv.hibernatedemo.service;

import io.vpv.hibernatedemo.dao.DepartmentDao;
import io.vpv.hibernatedemo.dao.EmployeeDao;
import io.vpv.hibernatedemo.model.Department;
import io.vpv.hibernatedemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private EmployeeDao employeeDao;
    private DepartmentDao departmentDao;

    @Autowired
    public EmployeeService(EmployeeDao employeeDao, DepartmentDao departmentDao) {
        this.employeeDao = employeeDao;
        this.departmentDao = departmentDao;
    }

    public Optional<Employee> findEmployeeById(String id) {
        Optional<Employee> e = employeeDao.findById(id);
        return e;
    }

    public Optional<Department> findDepartmentById(String id) {
        Optional<Department> d = departmentDao.findById(id);
        return d;
    }

    public List<Department> findAllDepartment() {
        List<Department> d = departmentDao.findAll();
        return d;
    }

    public List<Employee> findAllEmployee() {
        List<Employee> d = employeeDao.findAll();
        return d;
    }
}
