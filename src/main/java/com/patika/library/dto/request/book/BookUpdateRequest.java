package com.patika.library.dto.request.book;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookUpdateRequest {
    private int id;
    private String name;
    private String publicationYear;
    private int stock;
    private int authorId; // many to one
    private int publisherId;
}
