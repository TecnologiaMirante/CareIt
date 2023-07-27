package com.pmoc.mirante.dtos;

import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.models.antena.AntenaModel;
import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.models.checklist.TipoEquipamento;
import com.pmoc.mirante.models.gerais.DadosGerais;
import com.pmoc.mirante.models.gerais.Gerais;
import com.pmoc.mirante.models.receptor.ReceptorModel;
import com.pmoc.mirante.models.station.StationModel;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record TransmissorDTO(
        @NotNull
        @Valid
        Gerais gerais,
        @NotNull
        Status status,
        @NotNull
        Categories category,

        @NotNull
        ReceptorModel receptor,
        @NotNull
        AntenaModel antena,
        @NotNull
        Double programmed,
        @NotNull
        Double canal_fisico,
        @NotNull
        Double canal_virtual,
        String acoplador_one,
        String acoplador_two,
        @NotNull
        Long tipoEquipamentoID,
        UUID station
) {
}
