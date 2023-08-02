package com.pmoc.mirante.controller;

import com.pmoc.mirante.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/all")
public class AllController {
    @Autowired
    private AntenaService antenaService;
    @Autowired
    private ArcondicionadoService arcondicionadoService;
    @Autowired
    private CaboService caboService;
    @Autowired
    private CombinadorService combinadorService;
    @Autowired
    private DisjuntorService disjuntorService;
    @Autowired
    private DPSService dpsService;
    @Autowired
    private NobreakService nobreakService;
    @Autowired
    private ParabolicaService parabolicaService;
    @Autowired
    private SwitchService switchService;
    @Autowired
    private TelemetriaService telemetriaService;
    @Autowired
    private TorreService torreService;
    @Autowired
    private TransmissorService transmissorService;
    private List<Object> myList = new ArrayList<>();

    @GetMapping
    public ResponseEntity<AtivosDTO<Object>> getAllAtivos() {
        var ativosDTO = new AtivosDTO<Object>();

        ativosDTO.setAntenas(Collections.singletonList(antenaService.findAll()));
        ativosDTO.setArCondicionados(Collections.singletonList(arcondicionadoService.findAll()));
        ativosDTO.setCabos(Collections.singletonList(caboService.findAll()));
        ativosDTO.setCombinadores(Collections.singletonList(combinadorService.findAll()));
        ativosDTO.setDisjuntores(Collections.singletonList(disjuntorService.findAll()));
        ativosDTO.setDps(Collections.singletonList(dpsService.findAll()));
        ativosDTO.setNobreaks(Collections.singletonList(nobreakService.findAll()));
        ativosDTO.setParabolicas(Collections.singletonList(parabolicaService.findAll()));
        ativosDTO.setSwitchers(Collections.singletonList(switchService.findAll()));
        ativosDTO.setTelemetrias(Collections.singletonList(telemetriaService.findAll()));
        ativosDTO.setTorres(Collections.singletonList(torreService.findAll()));
        ativosDTO.setTransmissores(Collections.singletonList(transmissorService.findAll()));

        return ResponseEntity.ok(ativosDTO);
    }
}
