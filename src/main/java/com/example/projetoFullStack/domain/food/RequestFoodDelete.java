package com.example.projetoFullStack.domain.food;

import jakarta.validation.constraints.NotBlank;

//requisição com as validações corretas
public record RequestFoodDelete(@NotBlank String id) {
}
