package com.example.Ecommerce.employees;

import com.example.Ecommerce.maneger.MangerDto;
import com.example.Ecommerce.maneger.MangerEntity;
import com.example.Ecommerce.maneger.MangerRepo;
import com.example.Ecommerce.shops.ShopRepo;
import com.example.Ecommerce.shops.shopEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo repo;
    @Autowired
    ShopRepo shopRepo;
    @Autowired
    MangerRepo mangerRepo;

    public empleyeeEntity addEmplyee(EmpleyooDto empleyooDto) {
        MangerEntity mangers  = mangerRepo.findById((int) empleyooDto.getManger().getId()).orElseThrow(
                () -> new RuntimeException("manger not found")
        );

        empleyeeEntity empleyee = new empleyeeEntity();
        empleyee.setName(empleyooDto.getName());
        empleyee.setSalary(empleyooDto.getSalary());

        empleyee.setManger(mangers);

        return repo.save(empleyee);
    }

    public empleyeeEntity allEmplyes( ) {
        return repo.findAll().stream().findFirst().get();
    }
}
