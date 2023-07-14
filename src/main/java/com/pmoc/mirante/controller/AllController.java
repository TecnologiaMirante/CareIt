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
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.ArrayList;
import java.util.List;

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
    @Autowired
    private StationService stationService;
    private List<Object> myList = new ArrayList<>();
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping
    public ResponseEntity<List<Object>> getAllAntenas() {
        var antena = antenaService.findAll();
        var arCondicionados = arcondicionadoService.findAll();
        var cabos = caboService.findAll();
        var combinador = combinadorService.findAll();
        var disjuntor = disjuntorService.findAll();
        var dps = dpsService.findAll();
        var nobreak = nobreakService.findAll();
        var parabolica = parabolicaService.findAll();
        var switcher = switchService.findAll();
        var telemetria = telemetriaService.findAll();
        var torre = torreService.findAll();
        var transmissor = transmissorService.findAll();
        var station = stationService.findAll();

        myList.add(antena);
        myList.add(arCondicionados);
        myList.add(cabos);
        myList.add(combinador);
        myList.add(disjuntor);
        myList.add(dps);
        myList.add(nobreak);
        myList.add(parabolica);
        myList.add(switcher);
        myList.add(telemetria);
        myList.add(torre);
        myList.add(transmissor);

        return ResponseEntity.status(HttpStatus.OK).body(myList);
    }
}
