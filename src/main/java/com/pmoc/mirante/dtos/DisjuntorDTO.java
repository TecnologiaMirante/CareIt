package com.pmoc.mirante.dtos;

import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.models.checklist.TipoEquipamento;
import com.pmoc.mirante.models.gerais.Gerais;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

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
        private Long tipoEquipamento; // Utilize o tipo adequado para representar o ID do TipoEquipamento

        private UUID station; // Utilize o tipo adequado para representar o ID da StationModel (se necessário)

        // Construtor, getters e setters (ou você pode usar Lombok)

        public DisjuntorDTO() {
        }

        public DisjuntorDTO(@NotNull @Valid Gerais gerais, @NotNull int corrente_maxima, @NotNull Status status,
                            @NotNull Categories category, @NotNull Long tipoEquipamento, UUID station) {
                this.gerais = gerais;
                this.corrente_maxima = corrente_maxima;
                this.status = status;
                this.category = category;
                this.tipoEquipamento = tipoEquipamento;
                this.station = station;
        }

        // getters e setters (ou você pode usar Lombok)

        public Gerais getGerais() {
                return gerais;
        }

        public void setGerais(Gerais gerais) {
                this.gerais = gerais;
        }

        public int getCorrente_maxima() {
                return corrente_maxima;
        }

        public void setCorrente_maxima(int corrente_maxima) {
                this.corrente_maxima = corrente_maxima;
        }

        public Status getStatus() {
                return status;
        }

        public void setStatus(Status status) {
                this.status = status;
        }

        public Categories getCategory() {
                return category;
        }

        public void setCategory(Categories category) {
                this.category = category;
        }

        public Long getTipoEquipamento() {
                return tipoEquipamento;
        }

        public void setTipoEquipamento(Long tipoEquipamentoId) {
                this.tipoEquipamento = tipoEquipamentoId;
        }

        public UUID getStation() {
                return station;
        }

        public void setStation(UUID stationId) {
                this.station = stationId;
        }
}
