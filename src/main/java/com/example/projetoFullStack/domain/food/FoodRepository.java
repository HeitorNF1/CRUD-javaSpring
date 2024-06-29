package com.example.projetoFullStack.domain.food;

import org.springframework.data.jpa.repository.JpaRepository;

//interface usada como repository, no qual fica responsável pela manipulação do banco de dados

//para a mesma funcionar, devemos apenas extender o JpaRepository e passar <Entidade ,Tipo da primary key>
public interface FoodRepository extends JpaRepository<Food, String> {
}
