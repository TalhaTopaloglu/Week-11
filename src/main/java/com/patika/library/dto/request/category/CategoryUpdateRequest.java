package com.patika.library.dto.request.category;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryUpdateRequest {
    @Positive(message = "ID değeri negatif veya boş olamaz.")
    private int id;
    @NotNull(message = "Kategori ismi boş olamaz.")
    private String name;
    private String description;
}
