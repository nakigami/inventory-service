package com.glsid.soa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Product {
    @Id @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private double price;
    private double quantity;
}
