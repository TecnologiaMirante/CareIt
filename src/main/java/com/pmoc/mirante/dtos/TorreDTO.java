package com.pmoc.mirante.dtos;

import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.enums.TiposTorre;
import com.pmoc.mirante.models.checklist.TipoEquipamento;
import com.pmoc.mirante.models.gerais.DadosGerais;
import com.pmoc.mirante.models.gerais.Gerais;
import com.pmoc.mirante.models.station.StationModel;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record TorreDTO(
        @NotNull
        @Valid
        Gerais gerais,
        @NotNull
        Status status,
        @NotBlank
        Double altura,
        @NotBlank
        Boolean aterramento,
        @NotNull
        Categories category,
        @NotNull
        TiposTorre tipos_estrutura,
        @NotNull
        Long tipoEquipamentoID,
        UUID station
) {
}
