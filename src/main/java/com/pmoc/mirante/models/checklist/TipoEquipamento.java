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

@Table(name = "tpequipamento")
@Entity
@Getter
@Setter
public class TipoEquipamento implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "tpequipamento")
    private List<Checklist> checklist;

    @OneToMany(mappedBy = "tpequipamento")
    private List<ArCondicionado> arCondicionado;
    @OneToMany(mappedBy = "tpequipamento")
    private List<AntenaModel> antena;
    @OneToMany(mappedBy = "tpequipamento")
    private List<CaboModel> cabo;
    @OneToMany(mappedBy = "tpequipamento")
    private List<CombinadorModel> combinador;
    @OneToMany(mappedBy = "tpequipamento")
    private List<DisjuntorModel> disjuntor;
    @OneToMany(mappedBy = "tpequipamento")
    private List<DPSModel> dps;
    @OneToMany(mappedBy = "tpequipamento")
    private List<ExaustorModel> exaustor;
    @OneToMany(mappedBy = "tpequipamento")
    private List<NobreakModel> nobreak;
    @OneToMany(mappedBy = "tpequipamento")
    private List<Parabolica> parabolica;
    @OneToMany(mappedBy = "tpequipamento")
    private List<ReceptorModel> receptor;
    @OneToMany(mappedBy = "tpequipamento")
    private List<SwitcherModel> switcher;
    @OneToMany(mappedBy = "tpequipamento")
    private List<TelemetriaModel> telemetria;
    @OneToMany(mappedBy = "tpequipamento")
    private List<TorreModel> torre;
    @OneToMany(mappedBy = "tpequipamento")
    private List<TransmissorModel> transmissor;

}
