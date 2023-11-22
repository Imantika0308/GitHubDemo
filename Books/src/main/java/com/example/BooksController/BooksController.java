package com.example.BooksController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BooksModel.BooksModel;
import com.example.BooksService.BooksService;



@RestController
@RequestMapping("/books")
public class BooksController {
	
	@Autowired
	private BooksService service;
	
	@PostMapping("/addBook")
	public BooksModel saveBook(@RequestBody BooksModel books) {
		return service.saveBook(books);
	}
	
	@GetMapping("/getBooks")
	public List<BooksModel> getBooks(){
		return service.getBooks();
	}
}
