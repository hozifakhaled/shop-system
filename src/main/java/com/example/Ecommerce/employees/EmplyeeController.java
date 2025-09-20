package com.example.Ecommerce.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmplyeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmplyee")

    public empleyeeEntity addEmployee(@RequestBody EmpleyooDto empleyooDto) {
        return  employeeService.addEmplyee(empleyooDto);
    }

    @GetMapping("/allEmplyee")

    public empleyeeEntity allEmployee(  ) {
        return  employeeService.allEmplyes();
    }
}
