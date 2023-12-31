package com.pmoc.mirante.dtos;

import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.models.checklist.TipoEquipamento;
import com.pmoc.mirante.models.gerais.DadosGerais;
import com.pmoc.mirante.models.gerais.Gerais;
import com.pmoc.mirante.models.station.StationModel;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record ArCondicionadoDTO(
        @NotNull
        @Valid
        Gerais gerais,
        @NotNull
        int potencia,
        @NotNull
        Status status,
        @NotNull
        int tensao,
        @NotNull
        Categories category,
        @NotNull
        Long tipoEquipamentoID,
        UUID station
) {
}
