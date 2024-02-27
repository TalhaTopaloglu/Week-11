package com.patika.library.dto.request.bookBorrorwing;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowingSaveRequest {
    private String name;
    private LocalDate borrowingDate;
    private LocalDate returnDate;
    private int bookId;

}
