package com.pmoc.mirante.dtos;

import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.enums.TiposAntena;
import com.pmoc.mirante.models.checklist.TipoEquipamento;
import com.pmoc.mirante.models.gerais.DadosGerais;
import com.pmoc.mirante.models.gerais.Gerais;
import com.pmoc.mirante.models.station.StationModel;
import com.pmoc.mirante.models.transmissor.TransmissorModel;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record AntenaDTO(
        @NotNull
        @Valid
        Gerais gerais,
        @NotNull
        Status status,
        @NotNull
        Categories category,
        @NotNull
        TiposAntena tipos_antena,
        @NotBlank
        String vr,
        @NotBlank
        Double fendas,
        @NotBlank
        Double posicao_torre,
        @NotBlank
        String gain,
        @NotNull
        List<TransmissorModel> transmissor,
        @NotNull
        TipoEquipamento tipoEquipamento,
        StationModel station
) {
}
