package com.example.Ecommerce.employees;

import com.example.Ecommerce.maneger.MangerDto;
import com.example.Ecommerce.shops.ShopDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmpleyooDto {
    private int id;
    private String name;
    private int salary;
    private MangerDto manger;
}
