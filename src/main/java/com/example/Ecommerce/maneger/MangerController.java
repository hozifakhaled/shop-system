package com.example.Ecommerce.maneger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MangerController {
    @Autowired
    private MangerService mangerService;

    @PostMapping("/addManger")

    public MangerEntity addManger(@RequestBody MangerDto mangerDto) {
        return  mangerService.addManger(mangerDto);
    }
    @GetMapping("/getManger/{id}")

    public MangerEntity GetManger(@PathVariable  int id) {
        return  mangerService.getMangerById(id);
    }

    @DeleteMapping ("/deleteManger/{id}")
    public String deleteById(@PathVariable int id){
        mangerService.deleteById(id);
        return "Manger deleted";
    }
}
