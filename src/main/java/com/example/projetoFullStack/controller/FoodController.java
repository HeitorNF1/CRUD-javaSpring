package com.example.projetoFullStack.controller;


import com.example.projetoFullStack.domain.food.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/food")
public class FoodController {
    //definindo para o spring que esta classe que tera que fazer a injeção do sql com a notação
    //@Autowired
    @Autowired

    //instanciando um novo repository para manipularmos o bd
    private FoodRepository repository;

    @GetMapping
    public ResponseEntity getAll(){
        var allFoods = repository.findAll();
        return ResponseEntity.ok(allFoods);


    }

    @PostMapping

    public ResponseEntity addFood(@RequestBody @Valid RequestFood data){
        var newFood =  new Food(data);
        repository.save(newFood);
        return ResponseEntity.ok("Comida adicionada com suceso!");

    }

    @PutMapping

    public ResponseEntity updateFood(@RequestBody @Valid RequestFoodPut data){
        Food alterFood = repository.getReferenceById(data.id());
        alterFood.setImg(data.img());
        alterFood.setPrice(data.price());
        alterFood.setTitle(data.title());
        repository.save(alterFood);
        return ResponseEntity.ok("Comida alterada!");

    }

    @DeleteMapping

    public ResponseEntity deleteFood(@RequestBody @Valid RequestFoodDelete data){

        Food deleteFood = repository.getReferenceById(data.id());
        repository.delete(deleteFood);

        return ResponseEntity.ok("Comida deletada");
    }
}
