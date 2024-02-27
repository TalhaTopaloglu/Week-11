package com.patika.library.dto.request.book;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookSaveRequest {
  private String name;
  private String publicationYear;
  private int stock;
  private int authorId;
  private int publisherId;
}
