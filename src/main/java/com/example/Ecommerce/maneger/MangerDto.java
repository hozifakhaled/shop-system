package com.example.Ecommerce.maneger;

import com.example.Ecommerce.shops.ShopDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MangerDto {
    private int id;
    private String name;
    private String phone;
    private ShopDto shopDto;
}
