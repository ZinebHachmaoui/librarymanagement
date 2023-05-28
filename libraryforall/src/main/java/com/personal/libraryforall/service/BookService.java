package com.personal.libraryforall.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.personal.libraryforall.exception.BookNotFoundException;
import com.personal.libraryforall.model.Book;
import com.personal.libraryforall.repo.BookRepo;

@Service
@Transactional
public class BookService {

	private final BookRepo bookRepo;

	@Autowired
	public BookService(BookRepo bookRepo) {
		this.bookRepo = bookRepo;
	}

	public Book addBook(Book book) {
		book.setBookCode(UUID.randomUUID().toString());
		return bookRepo.save(book);
	}

	public List<Book> addBooks(List<Book> books) {
		List<Book> booksResultat = new ArrayList<>();
		books.forEach(x -> {
			Book res = addBook(x);
			booksResultat.add(res);
		});
		return booksResultat;
	}

	public List<Book> findAllBooks() {
		return bookRepo.findAll();
	}

	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}

	public Book findBookById(Long id) {
		return bookRepo.findBookById(id)
				.orElseThrow(() -> new BookNotFoundException("Book by id " + id + " was not found"));
	}

	public void deleteBook(Long id) {
		bookRepo.deleteBookById(id);
	}
}
