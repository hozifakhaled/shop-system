package com.example.Ecommerce.shops;

import com.example.Ecommerce.maneger.MangerEntity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopDto {


        private long id;
        private String name;
        private String city;


}
