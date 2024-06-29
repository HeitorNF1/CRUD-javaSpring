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

    //criação do método get para retornar todos os valores dentro da tabela foods
    @GetMapping
    public ResponseEntity getAll(){
        var allFoods = repository.findAll();
        return ResponseEntity.ok(allFoods);


    }

    //criação do comando post para envio para BD
    @PostMapping

    public ResponseEntity addFood(@RequestBody @Valid RequestFood data){
        //criando um novo objeto food
        var newFood =  new Food(data);
        //salvando no banco de dados
        repository.save(newFood);
        //retornando que deu tudo certo
        return ResponseEntity.ok("Comida adicionada com suceso!");

    }

    //instanciando o comando put (update)
    @PutMapping

    public ResponseEntity updateFood(@RequestBody @Valid RequestFoodPut data){
        //resgatando uma das linhas baseado no ID passado
        Food alterFood = repository.getReferenceById(data.id());
        //alterando as ccolunas para novos valores
        alterFood.setImg(data.img());
        alterFood.setPrice(data.price());
        alterFood.setTitle(data.title());
        //salvando no banco de dados
        repository.save(alterFood);
        //enviando resposta quando der certo
        return ResponseEntity.ok("Comida alterada!");

    }

    //instanciando o comando delte
    @DeleteMapping

    public ResponseEntity deleteFood(@RequestBody @Valid RequestFoodDelete data){
        //achando a comida pelo seu id
        Food deleteFood = repository.getReferenceById(data.id());
        //deletando com base no ID pasado
        repository.delete(deleteFood);
        //retornando resposta
        return ResponseEntity.ok("Comida deletada");
    }
}
