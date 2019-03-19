package com.library.Library;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

	@Autowired
	public BooksRepository booksRepository;

	@GetMapping("/books")
	public Collection<Books> getBooks() {
		return booksRepository.findAll();
	}

	@PostMapping("/books/Save")
	public void insertBookDetail(@RequestBody Books books) {
		booksRepository.save(books);
	}

}
