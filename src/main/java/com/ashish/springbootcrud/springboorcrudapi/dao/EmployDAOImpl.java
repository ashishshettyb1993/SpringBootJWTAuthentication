package com.ashish.springbootcrud.springboorcrudapi.dao;

import com.ashish.springbootcrud.springboorcrudapi.model.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

//@Repository
//public class EmployDAOImpl implements EmployeeDAO {
//
//    @Autowired
//    private EntityManager entityManager;
//
//    @Override
//    public List<Employee> get() {
//        Session currentSession = entityManager.unwrap(Session.class);
//        Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
//        List<Employee> list = query.getResultList();
//        return list;
//    }
//
//    @Override
//    public Employee get(int id) {
//        Session currentsession = entityManager.unwrap(Session.class);
//        Employee employee = currentsession.get(Employee.class,id);
//        return employee;
//    }
//
//    @Override
//    public void save(Employee employee) {
//        Session currentsession = entityManager.unwrap(Session.class);
//        currentsession.saveOrUpdate(employee);
//    }
//
//    @Override
//    public void delete(int id) {
//        Session currentses = entityManager.unwrap(Session.class);
//        Employee employee = currentses.get(Employee.class,id);
//        currentses.delete(employee);
//    }
//}
