package com.example.Ecommerce.maneger;

import com.example.Ecommerce.shops.ShopRepo;
import com.example.Ecommerce.shops.shopEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MangerService {

    @Autowired
    private MangerRepo mangerRepo;
    @Autowired
    private ShopRepo shopRepo;

    public MangerEntity addManger(MangerDto mangerDto) {

        shopEntity shop = shopRepo.findById((int) mangerDto.getShopDto().getId());

        MangerEntity mangerEntity = new MangerEntity();
        mangerEntity.setName(mangerDto.getName());
        mangerEntity.setPhone(mangerDto.getPhone());
        mangerEntity.setShop(shop); // اربطه بالـ shop

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
