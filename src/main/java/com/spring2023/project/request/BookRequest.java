package com.spring2023.project.request;

import com.spring2023.project.model.BookGenre;
import jakarta.persistence.Column;
import lombok.Getter;
import org.springframework.lang.Nullable;


public class BookRequest {
    private long id;
    @Getter
    private String title;
    @Getter
    private String author;
    @Nullable
    private double price;
    @Getter
    private BookGenre genre;
}
