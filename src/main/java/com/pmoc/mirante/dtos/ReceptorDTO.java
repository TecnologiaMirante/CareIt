package com.pmoc.mirante.dtos;

import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.models.checklist.TipoEquipamento;
import com.pmoc.mirante.models.gerais.DadosGerais;
import com.pmoc.mirante.models.gerais.Gerais;
import com.pmoc.mirante.models.parabolica.Parabolica;
import com.pmoc.mirante.models.station.StationModel;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record ReceptorDTO(
        @NotNull
        @Valid
        Gerais gerais,
        @NotNull
        int frequency,
        @NotNull
        Status status,
        @NotNull
        int symbol_rate,
        @NotNull
        Parabolica parabolica,
        @NotNull
        Categories category,
        @NotNull
        TipoEquipamento tipoEquipamento,
        StationModel station
) {
}
