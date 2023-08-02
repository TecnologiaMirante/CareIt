package com.pmoc.mirante.dtos;

import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.enums.TiposAntena;
import com.pmoc.mirante.models.gerais.Gerais;
import com.pmoc.mirante.models.transmissor.TransmissorModel;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.UUID;

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
        private Long tipoEquipamento;

        private UUID station;

        public AntenaDTO() {
        }

        public AntenaDTO(@NotNull @Valid Gerais gerais, @NotNull Status status, @NotNull Categories category,
                         @NotNull TiposAntena tipos_antena, @NotBlank String vr, @NotBlank Double fendas,
                         @NotBlank Double posicao_torre, @NotBlank String gain, @NotNull List<TransmissorModel> transmissor,
                         @NotNull Long tipoEquipamento, UUID station) {
                this.gerais = gerais;
                this.status = status;
                this.category = category;
                this.tipos_antena = tipos_antena;
                this.vr = vr;
                this.fendas = fendas;
                this.posicao_torre = posicao_torre;
                this.gain = gain;
                this.transmissor = transmissor;
                this.tipoEquipamento = tipoEquipamento;
                this.station = station;
        }

        // Getters e setters

        public Gerais getGerais() {
                return gerais;
        }

        public void setGerais(Gerais gerais) {
                this.gerais = gerais;
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

        public TiposAntena getTipos_antena() {
                return tipos_antena;
        }

        public void setTipos_antena(TiposAntena tipos_antena) {
                this.tipos_antena = tipos_antena;
        }

        public String getVr() {
                return vr;
        }

        public void setVr(String vr) {
                this.vr = vr;
        }

        public Double getFendas() {
                return fendas;
        }

        public void setFendas(Double fendas) {
                this.fendas = fendas;
        }

        public Double getPosicao_torre() {
                return posicao_torre;
        }

        public void setPosicao_torre(Double posicao_torre) {
                this.posicao_torre = posicao_torre;
        }

        public String getGain() {
                return gain;
        }

        public void setGain(String gain) {
                this.gain = gain;
        }

        public List<TransmissorModel> getTransmissor() {
                return transmissor;
        }

        public void setTransmissor(List<TransmissorModel> transmissor) {
                this.transmissor = transmissor;
        }

        public Long getTipoEquipamento() {
                return tipoEquipamento;
        }

        public void setTipoEquipamento(Long tipoEquipamento) {
                this.tipoEquipamento = tipoEquipamento;
        }

        public UUID getStation() {
                return station;
        }

        public void setStation(UUID station) {
                this.station = station;
        }
}
