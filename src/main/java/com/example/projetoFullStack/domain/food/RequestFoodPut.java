package com.example.projetoFullStack.domain.food;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

//requisição com as validações corretas
public record RequestFoodPut(
        @NotBlank String id,
        @NotBlank String title,
        @NotBlank String img,
        @NotNull Integer price) {
}
