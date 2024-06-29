package com.example.projetoFullStack.domain.food;

import jakarta.validation.constraints.NotBlank;

public record RequestFoodDelete(@NotBlank String id) {
}
