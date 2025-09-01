package com.example.Ecommerce.products;

import com.example.Ecommerce.orders.OrderEntity;
import com.example.Ecommerce.shops.shopEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private double price;

    @ManyToOne
    @JoinColumn(name = "shop_id", referencedColumnName = "id")
    private shopEntity shop;


}
