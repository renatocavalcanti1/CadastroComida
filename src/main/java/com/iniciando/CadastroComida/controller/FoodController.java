package com.iniciando.CadastroComida.controller;

import com.iniciando.CadastroComida.model.Food;
import com.iniciando.CadastroComida.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {


    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAll(){return foodService.getAll();}

    @PostMapping
    public Food create(@RequestBody Food food){return foodService.save(food);}
}
