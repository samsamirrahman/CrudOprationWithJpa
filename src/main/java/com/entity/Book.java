package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "book")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Book {
     @Id
   
    private Integer book_id;
    @NonNull
    private String book_name;
    @NonNull
    private String auth_name;
    @NonNull
    private Float price;
    
     
     
     
}
