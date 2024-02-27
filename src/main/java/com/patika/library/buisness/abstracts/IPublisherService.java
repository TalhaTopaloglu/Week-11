package com.patika.library.buisness.abstracts;

import com.patika.library.entities.Publisher;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

@Repository
public interface IPublisherService {
    Publisher save(Publisher publisher);
    Publisher get(int id);
    Page<Publisher> cursor(int page, int pageSize);
    Publisher update(Publisher publisher);
    boolean delete(int id);
}
