package com.patika.library.dto.request.publisher;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublisherUpdateRequest {
    @Positive(message = "ID değeri negatif veya boş olamaz.")
    private int id;
    @NotNull(message = "Yayıncı ismi boş olamaz.")
    private String name;
    private int establishmentYear;
    private String address;
}
