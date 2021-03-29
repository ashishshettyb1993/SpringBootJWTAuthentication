package com.ashish.springbootcrud.springboorcrudapi.dao;

import com.ashish.springbootcrud.springboorcrudapi.model.Book;
import com.ashish.springbootcrud.springboorcrudapi.model.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PageRepository extends JpaRepository<Page,Integer> {

    List<Page> findByBook(Book book);
}
