package com.pmoc.mirante.dtos;

import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.enums.ClasseDPS;
import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.models.checklist.TipoEquipamento;
import com.pmoc.mirante.models.gerais.DadosGerais;
import com.pmoc.mirante.models.gerais.Gerais;
import com.pmoc.mirante.models.station.StationModel;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record DPSDTO(
        @NotNull
        @Valid
        Gerais gerais,
        @NotNull
        Categories category,
        @NotNull
        Status status,
        @NotNull
        ClasseDPS classe,
        @NotNull
        int corrente_maxima,
        @NotNull
        Long tipoEquipamentoID,
        UUID station
) {
}
