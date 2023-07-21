package com.pmoc.mirante.dtos;

import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.models.checklist.TipoEquipamento;
import com.pmoc.mirante.models.gerais.DadosGerais;
import com.pmoc.mirante.models.gerais.Gerais;
import com.pmoc.mirante.models.receptor.ReceptorModel;
import com.pmoc.mirante.models.station.StationModel;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.UUID;

public record ParabolicaDTO(
        @NotNull
        @Valid
        Gerais gerais,
        @NotNull
        Double diametro,
        @NotNull
        Status status,
        @NotBlank
        String satelite,
        @NotNull
        List<ReceptorModel> receptor,
        @NotNull
        Long tipoEquipamentoID,
        UUID station,
        @NotNull
        Categories category
) {
}
