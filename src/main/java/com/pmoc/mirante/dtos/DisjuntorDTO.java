package com.pmoc.mirante.dtos;

import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.models.gerais.DadosGerais;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DisjuntorDTO(
        @NotNull
        @Valid
        DadosGerais gerais,
        int corrente_maxima,
        @NotNull
        Status status,
        @NotNull
        Categories category
) {

}
