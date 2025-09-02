package com.example.Ecommerce.shops;

import com.example.Ecommerce.maneger.MangerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepo extends JpaRepository<shopEntity, Integer> {
    shopEntity findById(int id);

    shopEntity deleteById(int id);

}
