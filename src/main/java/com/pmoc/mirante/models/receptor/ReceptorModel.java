package com.pmoc.mirante.models.receptor;

import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.models.checklist.TipoEquipamento;
import com.pmoc.mirante.models.gerais.Gerais;
import com.pmoc.mirante.models.parabolica.Parabolica;
import com.pmoc.mirante.models.station.StationModel;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Table(name = "receptor")
@Entity
@Getter
@Setter
public class ReceptorModel  implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Embedded
    private Gerais gerais;
    @Column(nullable = false, length = 250)
    private int frequency;
    @Column(nullable = false, length = 250)
    private int symbol_rate;
    @ManyToOne
    @JoinColumn(name = "parabolica_id")
    private Parabolica parabolica;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private Status status;
    @ManyToOne
    @JoinColumn(name = "station_id")
    private StationModel station;
    @ManyToOne
    @JoinColumn(name = "tipo_equipamento_id")
    private TipoEquipamento tipoEquipamento;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 250)
    private Categories category;
    @Column(nullable = false)
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;

}
