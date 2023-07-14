package com.pmoc.mirante.dtos;

import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.enums.ClasseDPS;
import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.models.gerais.DadosGerais;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DPSDTO(
        @NotNull
        @Valid
        DadosGerais gerais,
        @NotNull
        Categories category,
        @NotNull
        Status status,
        @NotNull
        ClasseDPS classe,
        @NotNull
        int corrente_maxima
) {
}
