package com.patika.library.buisness.abstracts;

import com.patika.library.entities.Author;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthorService {
    Author save(Author author);
    Author get(int id);
    Page<Author> cursor(int page, int pageSize);
    Author update(Author author);
    boolean delete(int id);
}
