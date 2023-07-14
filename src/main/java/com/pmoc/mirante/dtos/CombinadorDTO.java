package com.pmoc.mirante.dtos;

import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.models.gerais.DadosGerais;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record CombinadorDTO(
        @NotNull
        @Valid
        DadosGerais gerais,
        @NotNull
        Status status,
        @NotNull
        Categories category
) {
}
