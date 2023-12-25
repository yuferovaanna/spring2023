package com.spring2023.project.repository;

import com.spring2023.project.entity.BookEntity;
import com.spring2023.project.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    Book findByTitle(String name);
    Iterable<BookEntity> findByAuthor(String Author);
    Iterable<BookEntity> findByBookGenre(String bookGenre);
    void deleteByTitle(String name);
}
