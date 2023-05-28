package com.personal.libraryforall.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.libraryforall.model.Book;

public interface BookRepo extends JpaRepository<Book, Long> {
	
    void deleteBookById(Long id);

    Optional<Book> findBookById(Long id);
}
