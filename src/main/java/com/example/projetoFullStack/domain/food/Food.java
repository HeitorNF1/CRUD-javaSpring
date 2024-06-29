package com.example.projetoFullStack.domain.food;

import jakarta.persistence.*;
import lombok.*;

//referenciando o nome da tabela que iremos manipular no banco de dados
@Table(name = "foods")

//definindo o nome da entidade para manipularmos no código daqui para frente
@Entity(name = "foods")

//definindo com lombok os construtores e metodos de acesso
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {

    //definindo a chave primaria com as notações do jakarta
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String title;

    private String img;

    private Integer price;


    public Food(RequestFood data) {


        this.img = data.img();
        this.title = data.img();
        this.price = data.price();
    }

    public Food(RequestFoodPut data) {

        this.id = data.id();
        this.img = data.img();
        this.title = data.img();
        this.price = data.price();
    }


}
