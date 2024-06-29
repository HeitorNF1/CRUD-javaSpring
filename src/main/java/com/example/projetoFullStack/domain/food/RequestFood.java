package com.example.projetoFullStack.domain.food;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestFood(@NotBlank String title,
                          @NotBlank String img,
                          @NotNull Integer price) {
}
