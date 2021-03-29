package com.ashish.springbootcrud.springboorcrudapi.dao;

import com.ashish.springbootcrud.springboorcrudapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

    @Query("from Employee order by id desc")
    List<Employee> findBySorted();
}
