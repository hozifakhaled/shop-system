package com.example.Ecommerce.shops;

import com.example.Ecommerce.maneger.MangerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShopRepo extends JpaRepository<shopEntity, Integer> {
   Optional <shopEntity> findById(int id);

    Optional  <shopEntity> deleteById(int id);

}
