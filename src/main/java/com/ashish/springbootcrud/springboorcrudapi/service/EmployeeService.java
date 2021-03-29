package com.ashish.springbootcrud.springboorcrudapi.service;

import com.ashish.springbootcrud.springboorcrudapi.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}
