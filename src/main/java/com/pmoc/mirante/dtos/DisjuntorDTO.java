package com.pmoc.mirante.dtos;

import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.models.gerais.Gerais;
import com.pmoc.mirante.models.transmissor.TransmissorModel;
import jakarta.validation.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DisjuntorDTO {

        @NotNull
        @Valid
        private Gerais gerais;

        @NotNull
        private int corrente_maxima;

        @NotNull
        private Status status;

        @NotNull
        private Categories category;

        @NotNull
        private Long tipoEquipamentoID;

        private UUID stationId;

        private List<TransmissorModel> transmissor;
}
