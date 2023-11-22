package com.example.BooksRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BooksModel.BooksModel;

@Repository
public interface BooksRepository extends JpaRepository<BooksModel, Long> {
}