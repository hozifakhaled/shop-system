package com.example.Ecommerce.shops;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopService {
    @Autowired
     ShopRepo shopRepe ;


    public shopEntity addShop(ShopDto shopDto) {
        shopEntity shopEntity = new shopEntity();
        shopEntity.setName(shopDto.getName());
        shopEntity.setCity(shopDto.getCity());
        return shopRepe.save(shopEntity);
    }

    public shopEntity getShopById(int id) {
        return shopRepe.findById(id)
                ;
    }

    public String deleteById(int id) {
        if (!shopRepe.existsById(id)) {
            throw new RuntimeException("shop not found with id: " + id);
        }
        shopRepe.deleteById(id);
        return "shop deleted successfully";
    }

}
