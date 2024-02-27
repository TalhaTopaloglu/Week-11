package com.patika.library.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "publishers")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id",columnDefinition = "serial")
    private int id;

    @Column(name="publisher_name")
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name="publisher_establishment_year")
    private int establishmentYear;

    @Column(name="publisher_address")
    private String address;

    @OneToMany(mappedBy = "publisher")
    private List<Book> bookList;
}
