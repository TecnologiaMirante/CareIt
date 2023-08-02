package com.pmoc.mirante.dtos;

import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.models.disjuntor.DisjuntorModel;
import com.pmoc.mirante.models.gerais.Gerais;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;

public record DisjuntorDTO(

        @NotNull
        @Valid
        Gerais gerais,
        @NotNull
        Categories category,
        @NotNull
        Status status,
        @NotNull
        int corrente_maxima,
        @NotNull
        Long tipoEquipamento,
        UUID station
) {


}
