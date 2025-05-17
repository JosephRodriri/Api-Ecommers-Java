package com.example.aaaaaa.Product;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = false)
    private String title;
    private double price;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String category;
    private String image;
    private Double ratingRate;
    private Double ratingCount;


}
