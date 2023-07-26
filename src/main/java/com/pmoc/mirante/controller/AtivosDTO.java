package com.pmoc.mirante.controller;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AtivosDTO<T> {
    private List<T> antenas;
    private List<T> arCondicionados;
    private List<T> cabos;
    private List<T> combinadores;
    private List<T> disjuntores;
    private List<T> dps;
    private List<T> nobreaks;
    private List<T> parabolicas;
    private List<T> switchers;
    private List<T> telemetrias;
    private List<T> torres;
    private List<T> transmissores;

    // getters e setters
}

