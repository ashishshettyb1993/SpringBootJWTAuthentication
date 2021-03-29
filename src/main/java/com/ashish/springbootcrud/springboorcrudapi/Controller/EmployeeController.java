package com.ashish.springbootcrud.springboorcrudapi.Controller;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.ashish.springbootcrud.springboorcrudapi.Utility.JwtUtil;
import com.ashish.springbootcrud.springboorcrudapi.dao.BookRepository;
import com.ashish.springbootcrud.springboorcrudapi.dao.EmployeeDAO;
import com.ashish.springbootcrud.springboorcrudapi.dao.PageRepository;
import com.ashish.springbootcrud.springboorcrudapi.model.Book;
import com.ashish.springbootcrud.springboorcrudapi.model.Employee;
import com.ashish.springbootcrud.springboorcrudapi.model.Login;
import com.ashish.springbootcrud.springboorcrudapi.model.Page;
import com.ashish.springbootcrud.springboorcrudapi.service.EmployeeService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Vector;

@RestController
@RequestMapping("/api")
public class EmployeeController {

//    @Autowired
//    private EmployeeService employeeService;

    @Autowired
    EmployeeDAO employeeDAO;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    PageRepository pageRepository;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @RequestMapping(path = "/employee")
    public List<Employee> get() {
        //System.out.println(employeeDAO.findBySorted());


        Book book=bookRepository.findByIsbn("123456");
        System.out.println(book);

        List<Page> pages=pageRepository.findByBook(book);
        System.out.println(pages);


        return employeeDAO.findAll();
    }

    @PostMapping("/employee")
    public Employee Save(@RequestBody Employee employee) {
        return employeeDAO.save(employee);
    }

    @GetMapping("/employee/{id}")
    public Employee GetEmployee(@PathVariable int id) {
        Optional<Employee> employee = employeeDAO.findById(id);
        if (employee.isPresent()) {
            return employee.get();
        } else {
            throw new RuntimeException("Employee not found");
        }
    }

    @DeleteMapping("/employee/{id}")
    public String DeleteEmployee(@PathVariable int id) {
        employeeDAO.deleteById(id);
        return "Employee has been deleted";
    }

    @PutMapping("/employee")
    public Employee update(@RequestBody Employee employee) {
        return employeeDAO.save(employee);
    }

    @RequestMapping("/home")
    public String home() {
        return "home.jsp";
    }

    @PostMapping("/authenticate")
    public JSONObject generateToken(@RequestBody Login login) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(login.getUsername(), login.getPassword()));
        } catch (Exception ex) {
            throw new Exception("invalid username/password");
        }
        JSONObject jobj = new JSONObject();
        jobj.put("Token", jwtUtil.generateToken(login.getUsername()));
        return jobj;
    }


}
