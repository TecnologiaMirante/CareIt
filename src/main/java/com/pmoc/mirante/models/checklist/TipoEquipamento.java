package com.pmoc.mirante.models.checklist;

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
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Table(name = "tipo_equipamento")
@Entity
@Getter
@Setter
public class TipoEquipamento implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "tipoEquipamento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Checklist> checklist;

    @OneToMany(mappedBy = "tipoEquipamento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ArCondicionado> arCondicionado;
    @OneToMany(mappedBy = "tipoEquipamento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<AntenaModel> antena;
    @OneToMany(mappedBy = "tipoEquipamento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CaboModel> cabo;
    @OneToMany(mappedBy = "tipoEquipamento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CombinadorModel> combinador;
    @OneToMany(mappedBy = "tipoEquipamento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<DisjuntorModel> disjuntor;
    @OneToMany(mappedBy = "tipoEquipamento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<DPSModel> dps;
    @OneToMany(mappedBy = "tipoEquipamento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ExaustorModel> exaustor;
    @OneToMany(mappedBy = "tipoEquipamento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<NobreakModel> nobreak;
    @OneToMany(mappedBy = "tipoEquipamento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Parabolica> parabolica;
    @OneToMany(mappedBy = "tipoEquipamento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ReceptorModel> receptor;
    @OneToMany(mappedBy = "tipoEquipamento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<SwitcherModel> switcher;
    @OneToMany(mappedBy = "tipoEquipamento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<TelemetriaModel> telemetria;
    @OneToMany(mappedBy = "tipoEquipamento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<TorreModel> torre;
    @OneToMany(mappedBy = "tipoEquipamento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<TransmissorModel> transmissor;
}
