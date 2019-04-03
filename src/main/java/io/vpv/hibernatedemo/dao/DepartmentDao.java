package io.vpv.hibernatedemo.dao;

import io.vpv.hibernatedemo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentDao extends JpaRepository<Department, String> {

}
