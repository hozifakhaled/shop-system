package com.example.Ecommerce.employees;


import com.example.Ecommerce.shops.shopEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class empleyeeEntity {
    @Id
    private int id;
    private String name;
    private int salary;

    @ManyToOne
    @JoinColumn(name = "emplyee_id", referencedColumnName = "id")
    private shopEntity shopEntity;
}
