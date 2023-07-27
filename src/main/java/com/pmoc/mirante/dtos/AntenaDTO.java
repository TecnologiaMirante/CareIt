package com.pmoc.mirante.dtos;

import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.enums.TiposAntena;
import com.pmoc.mirante.models.gerais.Gerais;
import com.pmoc.mirante.models.station.StationModel;
import com.pmoc.mirante.models.transmissor.TransmissorModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;
import java.util.UUID;
import jakarta.validation.*;
import jakarta.validation.constraints.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AntenaDTO {

        @NotNull
        @Valid
        private Gerais gerais;

        @NotNull
        private Status status;

        @NotNull
        private Categories category;

        @NotNull
        private TiposAntena tipos_antena;

        @NotBlank
        private String vr;

        @NotBlank
        private Double fendas;

        @NotBlank
        private Double posicao_torre;

        @NotBlank
        private String gain;

        @NotNull
        private List<TransmissorModel> transmissor;

        @NotNull
        private Long tipoEquipamentoID;

        private UUID stationId;
}
