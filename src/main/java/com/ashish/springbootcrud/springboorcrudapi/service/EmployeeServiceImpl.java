package com.ashish.springbootcrud.springboorcrudapi.service;

import com.ashish.springbootcrud.springboorcrudapi.dao.EmployeeDAO;
import com.ashish.springbootcrud.springboorcrudapi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//
//    @Autowired
//    private EmployeeDAO employeeDAO;
//
//    @Transactional
//    @Override
//    public List<Employee> get() {
//        return employeeDAO.get();
//    }
//
//    @Transactional
//    @Override
//    public Employee get(int id) {
//        return employeeDAO.get(id);
//    }
//
//    @Transactional
//    @Override
//    public void save(Employee employee) {
//        employeeDAO.save(employee);
//    }
//
//    @Transactional
//    @Override
//    public void delete(int id) {
//        employeeDAO.delete(id);
//    }
//}
