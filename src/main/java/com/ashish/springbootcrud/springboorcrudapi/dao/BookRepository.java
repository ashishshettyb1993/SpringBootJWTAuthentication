package com.ashish.springbootcrud.springboorcrudapi.dao;

import com.ashish.springbootcrud.springboorcrudapi.model.Book;
import com.ashish.springbootcrud.springboorcrudapi.model.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    Book findByIsbn(String isbn);
}
