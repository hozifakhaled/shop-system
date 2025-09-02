package com.example.Ecommerce.shops;

import com.example.Ecommerce.maneger.MangerDto;
import com.example.Ecommerce.maneger.MangerEntity;
import com.example.Ecommerce.maneger.MangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @PostMapping("/addShop")

    public shopEntity addShop(@RequestBody ShopDto shopDto) {
        return  shopService. addShop(shopDto);
    }
    @GetMapping("/getshop/{id}")

    public shopEntity getShopById(@PathVariable  int id) {
        return  shopService.getShopById(id);
    }

    @DeleteMapping ("/deleteShopById/{id}")
    public String deleteShopById(@PathVariable int id){
        shopService.deleteById(id);
        return "Manger deleted";
    }
}
