package com.spring2023.project.service;

import com.spring2023.project.model.Author;
import com.spring2023.project.model.Book;
import com.spring2023.project.request.BookRequest;
import org.springframework.stereotype.Service;
import org.springframework.lang.Nullable;
import java.util.AbstractMap.SimpleEntry;
import java.util.List;


@Service
public interface BookService {
    /**
     * Creates or updates existing Book
     * @param book - Book to update/create
     * @return created or updated Book
     */
    SimpleEntry<Book, List<Author>> createOrUpdateBook(BookRequest book);
    /**
     * get all books from DataBase that satisfy given search query
     * @param name - search query to filter books with
     * @return - list of books that satisfy given criteria
     */
    SimpleEntry<List<Book>, List<Author>> getBooks(@Nullable String name);
    /**
     * Get Book by ID
     * @param id - ID of desired book
     * @return Book from DataBase
     */
    SimpleEntry<Book, List<Author>> getBookByID(long id);
    /**
     * Delete existing Book
     * @param id - Book ID to delete
     */
    void deleteBook(long id);
}
