package com.domino.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.domino.dto.Book;
import com.domino.service.BookService;

@RestController
@RequestMapping("/rest")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = "/books",method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@GetMapping(value ="/hello",produces = MediaType.APPLICATION_JSON_VALUE)  
    public String hello(){  
        return "Hello!";  
    }  
}
