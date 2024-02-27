package com.patika.library.buisness.abstracts;

import com.patika.library.entities.Book;
import com.patika.library.entities.Category;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryService {
    Category save(Category category);
    Category get(int id);
    Page<Category> cursor(int page, int pageSize);
    Category update(Category category);
    boolean delete(int id);
}
