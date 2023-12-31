package com.pmoc.mirante.models.station;

import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.models.antena.AntenaModel;
import com.pmoc.mirante.models.arcondicionado.ArCondicionado;
import com.pmoc.mirante.models.cabo.CaboModel;
import com.pmoc.mirante.models.combinador.CombinadorModel;
import com.pmoc.mirante.models.disjuntor.DisjuntorModel;
import com.pmoc.mirante.models.dps.DPSModel;
import com.pmoc.mirante.models.exaustor.ExaustorModel;
import com.pmoc.mirante.models.nobreak.NobreakModel;
import com.pmoc.mirante.models.parabolica.Parabolica;
import com.pmoc.mirante.models.receptor.ReceptorModel;
import com.pmoc.mirante.models.switcher.SwitcherModel;
import com.pmoc.mirante.models.telemetria.TelemetriaModel;
import com.pmoc.mirante.models.torre.TorreModel;
import com.pmoc.mirante.models.transmissor.TransmissorModel;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "station")
@Getter
@Setter
public class StationModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, length = 100)
    private String nome;
    @Column(nullable = false, length = 130)
    private String latitude;
    @Column(nullable = false, length = 130)
    private String longitude;
    @Column(nullable = false, length = 100)
    private String endereco;
    @Column(nullable = false, length = 250)
    private String link_grafana;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private Status status;

    @OneToMany(mappedBy = "station", fetch = FetchType.EAGER)
    private List<ReceptorModel> receptor;

    @OneToMany(mappedBy = "station", fetch = FetchType.EAGER)
    private List<Parabolica> parabolica;

    @OneToMany(mappedBy = "station", fetch = FetchType.EAGER)
    private List<AntenaModel> antena;

    @OneToMany(mappedBy = "station", fetch = FetchType.EAGER)
    private List<ArCondicionado> arCondicionado;

    @OneToMany(mappedBy = "station", fetch = FetchType.EAGER)
    private List<CaboModel> cabo;

    @OneToMany(mappedBy = "station", fetch = FetchType.EAGER)
    private List<CombinadorModel> combinador;

    @OneToMany(mappedBy = "station", fetch = FetchType.EAGER)
    private List<DisjuntorModel> disjuntor;

    @OneToMany(mappedBy = "station", fetch = FetchType.EAGER)
    private List<DPSModel> dps;

    @OneToMany(mappedBy = "station", fetch = FetchType.EAGER)
    private List<ExaustorModel> exaustor;

    @OneToMany(mappedBy = "station", fetch = FetchType.EAGER)
    private List<NobreakModel> nobreak;

    @OneToMany(mappedBy = "station", fetch = FetchType.EAGER)
    private List<SwitcherModel> switcher;

    @OneToMany(mappedBy = "station", fetch = FetchType.EAGER)
    private List<TelemetriaModel> telemetria;

    @OneToMany(mappedBy = "station", fetch = FetchType.EAGER)
    private List<TorreModel> torre;

    @OneToMany(mappedBy = "station", fetch = FetchType.EAGER)
    private List<TransmissorModel> transmissor;

    @Column(nullable = false)
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;

}
