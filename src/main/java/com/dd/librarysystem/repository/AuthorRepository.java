package com.dd.librarysystem.repository;

import com.dd.librarysystem.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    List<Author> findByName(String name);
}
