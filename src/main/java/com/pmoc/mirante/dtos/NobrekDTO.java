package com.pmoc.mirante.dtos;

import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.models.gerais.DadosGerais;
import com.pmoc.mirante.models.gerais.Gerais;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record NobrekDTO(
        @NotNull
        @Valid
        Gerais gerais,
        @NotBlank
        int tensao_entrada,
        @NotNull
        Status status,
        @NotBlank
        int tensao_saida,
        @NotNull
        Categories category
) {
}
