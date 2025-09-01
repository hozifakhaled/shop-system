package com.example.Ecommerce.maneger;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MangerRepo  extends JpaRepository<MangerEntity, Integer> {
    MangerEntity findById(int id);

    MangerEntity deleteById(int id);
}
