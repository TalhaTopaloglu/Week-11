package com.patika.library.buisness.abstracts;

import com.patika.library.entities.Book;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookService {

    Book save(Book book);
    Book get(int id);
    Page<Book> cursor(int page, int pageSize);
    Book update(Book book);
    boolean delete(int id);
}
