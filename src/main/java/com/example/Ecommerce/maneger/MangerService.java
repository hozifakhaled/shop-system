package com.example.Ecommerce.maneger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MangerService {

    @Autowired
    private MangerRepo mangerRepo;

    public MangerEntity addManger(MangerDto mangerDto) {
        MangerEntity mangerEntity = new MangerEntity();
        mangerEntity.setName(mangerDto.getName());
        mangerEntity.setPhone(mangerDto.getPhone());
        return mangerRepo.save(mangerEntity);
    }

    public MangerEntity getMangerById(int id) {
        return mangerRepo.findById(id)
                ;
    }

    public String deleteById(int id) {
        if (!mangerRepo.existsById(id)) {
            throw new RuntimeException("Manger not found with id: " + id);
        }
        mangerRepo.deleteById(id);
        return "Manger deleted successfully";
    }
}
