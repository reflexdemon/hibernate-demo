package io.vpv.hibernatedemo.dao;

import io.vpv.hibernatedemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, String> {
}
