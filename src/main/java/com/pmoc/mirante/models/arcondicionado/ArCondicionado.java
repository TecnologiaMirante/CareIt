package com.pmoc.mirante.models.arcondicionado;

import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.models.checklist.TipoEquipamento;
import com.pmoc.mirante.models.gerais.Gerais;
import com.pmoc.mirante.models.station.StationModel;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "arcondicionado")
@Entity
@Getter
@Setter
public class ArCondicionado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Embedded
    private Gerais gerais;
    @Column(nullable = false, length = 100)
    private int potencia;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private Status status;
    @Column(nullable = false, length = 100)
    private int tensao;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 100)
    private Categories category;

    @ManyToOne
    @JoinColumn(name = "station_id")
    private StationModel station;

    @ManyToOne
    @JoinColumn(name = "tipo_equipamento_id")
    private TipoEquipamento tipoEquipamento;

    @Column(nullable = false)
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;
}
