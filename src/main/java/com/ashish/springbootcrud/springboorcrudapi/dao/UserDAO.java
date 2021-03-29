package com.ashish.springbootcrud.springboorcrudapi.dao;

import com.ashish.springbootcrud.springboorcrudapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
