package com.example.Ecommerce.maneger;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MangerRepo  extends JpaRepository<MangerEntity, Integer> {
 Optional <MangerEntity> findById(int id);

    Optional <   MangerEntity> deleteById(int id);
}
