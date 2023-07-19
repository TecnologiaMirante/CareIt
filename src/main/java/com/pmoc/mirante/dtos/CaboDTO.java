package com.pmoc.mirante.dtos;

import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.enums.TiposCabo;
import com.pmoc.mirante.models.checklist.TipoEquipamento;
import com.pmoc.mirante.models.gerais.DadosGerais;
import com.pmoc.mirante.models.gerais.Gerais;
import com.pmoc.mirante.models.station.StationModel;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record CaboDTO(
        @NotNull
        @Valid
        Gerais gerais,
        @NotNull
        Categories category,
        @NotNull
        Status status,
        @NotNull
        TiposCabo tipos_cabo,
        @NotNull
        Double tamanho,
        @NotNull
        TipoEquipamento tipoEquipamento,
        StationModel station
) {
}
