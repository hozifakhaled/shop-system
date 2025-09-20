package com.example.Ecommerce.employees;

import com.example.Ecommerce.shops.shopEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo  extends JpaRepository<empleyeeEntity, Integer> {

    Optional<empleyeeEntity> findById(int id);

    Optional  <empleyeeEntity> deleteById(int id);
}
