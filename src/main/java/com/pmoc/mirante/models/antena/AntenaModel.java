package com.pmoc.mirante.models.antena;

import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.enums.TiposAntena;
import com.pmoc.mirante.models.checklist.TipoEquipamento;
import com.pmoc.mirante.models.gerais.Gerais;
import com.pmoc.mirante.models.station.StationModel;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "antena")
@Entity
@Getter
@Setter
public class AntenaModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Embedded
    private Gerais gerais;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 250)
    private Categories category;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private Status status;
    @Column(nullable = false, length = 250)
    private String gain;
    @Column(nullable = false, length = 100)
    private Double fendas;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 80)
    private TiposAntena tiposAntena;
    @Column(nullable = false, length = 120)
    private Double posicao_torre;
    @Column(nullable = false, length = 120)
    private String vr;
    @Column(nullable = false)
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "station_id")
    private StationModel station;

    @ManyToOne
    @JoinColumn(name = "tipo_equipamento_id")
    private TipoEquipamento tipoEquipamento;

}
