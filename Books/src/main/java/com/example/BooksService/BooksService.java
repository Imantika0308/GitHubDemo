package com.example.BooksService;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BooksModel.BooksModel;
import com.example.BooksRepository.BooksRepository;

@Service
public class BooksService {

	@Autowired
	BooksRepository repo;
	
	public BooksModel saveBook(BooksModel books) {
		return repo.save(books);
	}
	
	public List<BooksModel> getBooks(){
		return (List<BooksModel>) repo.findAll();
		
	}
}
